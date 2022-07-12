package com.galvanize;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0) return;
        int x = -3;
        int y = 4;
        //primitives can use operators
        if (x < 0) {
            System.out.println("less than 0");
        } else if (x > 0) {
            System.out.println("greater than 0");
        } else {
            System.out.println("0");
        }
        //objects need to use .equal
        String foo = "foo";
        String bar = "bar";

        if (foo.equals(bar)) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
