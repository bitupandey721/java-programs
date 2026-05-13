public class ExceptionHeading {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;

            int result = a / b; // may cause exception
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");

        } finally {
            System.out.println("Execution completed");
        }
    }
}