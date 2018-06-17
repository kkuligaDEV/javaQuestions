package com.questions.examples.staticmethods;

public class MyDataImpl implements MyData {
    public boolean isNull(String str) {
        System.out.println("Imp Null check");
        return str == null ? true : false;
    }

    public static void main(String[] args) {
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
    }
}
