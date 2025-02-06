package org.example.classes;

public class GenericMethods {
    public static <T, U, V> void args (T arg1, U arg2, V arg3) {
        System.out.println("Argument 1: " + arg1 +
                "\nArgument 2: " + arg2 +
                "\nArgument 3: " + arg3);
    }
}