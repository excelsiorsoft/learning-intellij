package com.example.idea;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("David", "Smith", 40);
        System.out.println(person);

        String[] colors = new String[]{"Red", "Green", "Blue"};
        for (String color :
                colors) {
            System.out.println("The color is " + color);
        }

    }
}
