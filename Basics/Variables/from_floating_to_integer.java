public class from_floating_to_integer {

    public static void main(String[] args) {
        
        double floatingPoint = 0.42;
        floatingPoint = 1; // Works
        System.out.println(floatingPoint);

        int value = 10;
        floatingPoint = value; // Also works
        System.out.println(floatingPoint);
    }
}
