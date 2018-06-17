package com.questions.examples.staticmethods;

public interface MyData {
    default void print(String str) {
        if (isNull(str)) {
            System.out.println("My Data print:: "+str);
        }
    }

    static boolean isNull(String str) {
        System.out.println("Interface null check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
