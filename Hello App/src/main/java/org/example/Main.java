package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
        }
    }
}
