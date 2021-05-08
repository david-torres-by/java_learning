import java.util.Scanner;

public class waiting_for_user_input {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First String
        System.out.println("Write the first string: ");
        String first_string = scanner.nextLine();

        // Second String
        System.out.println("Write the second string: ");
        String second_string = scanner.nextLine();

        // Third String
        System.out.println("Write the third string: ");
        String third_string = scanner.nextLine();

        System.out.println(first_string + "" + second_string + "" + third_string);
    }
}
