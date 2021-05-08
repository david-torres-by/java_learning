import java.util.Scanner;

public class input_string_as_apart_of_output{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write Something: ");

        String new_message = scanner.nextLine();

        System.out.println("You wrote " + new_message);
    }
}