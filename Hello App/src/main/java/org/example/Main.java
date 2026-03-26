package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String output;

        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        } else {
            // Default case
            output = "Hello, World!";
        }

        System.out.println(output);
    }
}
