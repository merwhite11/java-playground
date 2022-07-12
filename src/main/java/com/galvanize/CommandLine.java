package com.galvanize;

public class CommandLine {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(String.format("<%s>", args[1]));
    }
}
