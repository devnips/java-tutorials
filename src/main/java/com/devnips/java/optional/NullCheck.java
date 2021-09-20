package com.devnips.java.optional;

import java.util.Optional;

public class NullCheck {

    /**
     * Using Java 5 or earlier.
     *
     * @param s
     */
    public void preJava8(String s) {
        if (s == null) {
            // do something
            System.out.println("String is null");
        }
        System.out.println("String is not null");
    }

    /**
     * Using Optionals in Java 8
     *
     * @param s
     */
    public void java8Optional(String s) {
        Optional.ofNullable(s)
                .ifPresent((str) -> {
                    //do something
                    System.out.println("String is not null");
                });
    }

    /**
     * Using Optionals in Java 9 or later
     *
     * @param s
     */
    public void java9Optional(String s) {
        Optional.ofNullable(s)
                .ifPresentOrElse(
                        (str) -> {
                            //do something
                            System.out.println("String is not null");
                        },
                        () -> {
                            //do something
                            System.out.println("String is null");
                        });
    }
}
