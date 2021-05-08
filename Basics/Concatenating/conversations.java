import java.util.Scanner;

public class conversations {
    public static void main(String[] args) {

        // Getting the scanner to say something
        Scanner scanner = new Scanner(System.in);

        //*****Conversation *****
        // Write sout and autocomplete
        System.out.println("Greetings! How are you? ");
        String first = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println("Thanks for sharing!");

        System.out.println(first);
        System.out.println(second);
        System.out.println("Bye bye!");
    }
}
