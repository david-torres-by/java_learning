import java.util.Scanner;

public class printing_multiple_times {
    public static void main(String[] args) {
        //Create the tool for reading, assign it to variable caller "scanner
        Scanner scanner = new Scanner(System.in);
        
        //Print user a message
        System.out.println("What's your message, master?: ");

        //Read the user's string input, save it to program memory
        //"String multiple_message = (user input)"
        String multiple_message = scanner.nextLine();

        // Print the user input thrice
        System.out.println(multiple_message);
        System.out.println(multiple_message);
        System.out.println(multiple_message);

    }
}
