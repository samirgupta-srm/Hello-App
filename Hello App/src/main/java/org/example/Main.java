package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String output;

        if (args.length == 0) {
            // Default case
            output = "Hello, World!";
        } else {
            // Use StringBuilder for efficient string creation
            StringBuilder names = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            output = "Hello, " + names.toString() + "!";
        }

        System.out.println(output);
    }
}
