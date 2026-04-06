public class Main {
    public static void main(String[] args) {

        String output;

        if (args.length == 0) {
            // Default case
            output = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            // Add all names with comma + space
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove last ", " using substring
            String finalNames = names.substring(0, names.length() - 2);

            output = "Hello, " + finalNames + "!";
        }

        System.out.println(output);
    }
}