public class Main {
    public static void main(String[] args) {

        String output;

        if (args.length == 0) {
            // Default case
            output = "Hello, World!";
        } else {
            // Use String.join to combine names
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        }

        System.out.println(output);
    }
}