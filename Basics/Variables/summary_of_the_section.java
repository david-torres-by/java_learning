import java.util.Scanner;

public class summary_of_the_section {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        //String
        System.out.println("Give a string: ");
        String text = scan.nextLine();
        
        //Integer
        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scan.nextLine());
        
        //Double
        System.out.println("Give a double: ");
        double value_double = Double.valueOf(scan.nextLine());
        
        //Boolean
        System.out.println("Give a boolean: ");
        boolean value_boolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + value_double);
        System.out.println("You gave the boolean " + value_boolean);
    }
}
