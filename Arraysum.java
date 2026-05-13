import java.util.*;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input n
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int sum = 0;

        //Input numbers and calculate sum
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        // Step 3: Output result
        System.out.println("Sum = " + sum);
    }
}