import java.util.Scanner;

public class printing_my_name_as_input {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name, m8?");

        String my_name = scanner.nextLine();

        System.out.println("Hi " + my_name + "!");
    }
}
