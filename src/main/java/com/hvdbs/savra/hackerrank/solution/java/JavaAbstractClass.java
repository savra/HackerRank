package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Abstract Class",
        url = "https://www.hackerrank.com/challenges/java-abstract-class"
)
public class JavaAbstractClass {
    abstract static class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    static class MyBook extends Book {
        @Override
        public void setTitle(String s) {
            title = s;
        }
    }

    public static void main(String[] args) {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }
}
