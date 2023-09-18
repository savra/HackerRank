package com.hvdbs.savra.hackerrank.statsgenerator;

import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;
import lombok.Builder;
import lombok.Data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatsGenerator {
    private static final String packageName = "com.hvdbs.savra.hackerrank.solution.java";
    private static final String solutionBaseUrl = "https://github.com/savra/HackerRank/tree/master/src/main/java/com/hvdbs/savra/hackerrank/solution/java/";

    public static void generate() {
        try (InputStream inputStream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replace('.', '/'))) {
            if (inputStream == null) {
                return;
            }

            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("README.md"), StandardOpenOption.TRUNCATE_EXISTING);
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

                bufferedWriter.append("# HackerRank");
                bufferedWriter.newLine();
                bufferedWriter.append("Solving problems on HackerRank");

                Map<Difficulty, List<OutputHackerRankFormat>> difficultyListMap = bufferedReader.lines()
                        .map(solution -> {
                            String className = packageName + "." + solution.substring(0, solution.lastIndexOf('.'));

                            try {
                                HackerRankInfo hackerRankInfo = Class.forName(className).getAnnotation(HackerRankInfo.class);

                                if (hackerRankInfo != null) {
                                    return OutputHackerRankFormat.builder()
                                            .difficulty(hackerRankInfo.difficulty())
                                            .name(hackerRankInfo.name())
                                            .problemUrl(hackerRankInfo.url())
                                            .solutionUrl(solutionBaseUrl + solution.replace("class", "java"))
                                            .build();
                                }

                                return null;
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                        })
                        .filter(Predicate.not(Objects::isNull))
                        .collect(Collectors.groupingBy(OutputHackerRankFormat::getDifficulty));

                for (Difficulty difficulty : difficultyListMap.keySet()) {
                    bufferedWriter.newLine();
                    bufferedWriter.append("<details>");
                    bufferedWriter.newLine();
                    bufferedWriter.append("<summary>").append(String.valueOf(difficulty)).append("</summary>");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.append("|Name|Problem|Solution|");
                    bufferedWriter.newLine();
                    bufferedWriter.append("|---|---|---|");
                    bufferedWriter.newLine();

                    for (OutputHackerRankFormat hackerRankFormat : difficultyListMap.get(difficulty)) {
                        bufferedWriter.append("|")
                                .append(hackerRankFormat.getName())
                                .append("|")
                                .append(hackerRankFormat.getProblemUrl())
                                .append("|")
                                .append("<a href='").append(hackerRankFormat.getSolutionUrl()).append("'>").append(hackerRankFormat.getName()).append("</a>")
                                .append("|");
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.append("</details>");
                }
            }

        } catch (IOException ignored) {

        }
    }

    @Builder
    @Data
    private static final class OutputHackerRankFormat {
        private String name;
        private String problemUrl;
        private String solutionUrl;
        private Difficulty difficulty;
    }
}
