package com.questions.examples;

public interface Interface1 {
    static void print(String abc) {
        System.out.println("Static method: interface1");
    }

    void method1(String str);

    default void log(String str) {
        System.out.println("I1 logging: "+str);
    }
}
