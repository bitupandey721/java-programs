import java.util.*;

public class CountEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Count even numbers
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        // Output
        System.out.println("Total even numbers = " + count);
    }
}