package com.hvdbs.savra.hackerrank.statsgenerator;

import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface HackerRankInfo {
    Difficulty difficulty();

    String name();

    String url();
}
