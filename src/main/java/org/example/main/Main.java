package org.example.main;

import org.example.classes.GenericMethods;
import org.example.classes.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person ("Aiden", "Romero", 25);

        GenericMethods.args(person1, 34.7, "Pepe");
        GenericMethods.args("Dog", 39, person1);
        GenericMethods.args(new Person("Michael", "Smith", 40), person1, 1.5);
    }
}