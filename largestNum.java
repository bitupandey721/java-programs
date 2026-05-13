import java.util.*;
public class largestNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         //Input n
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
       
        int arr[]=new int[n];
        int max=arr[n-1];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            // Initialize max with first element
             max=arr[0];

             // Find largest element
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest element is="+ max);

    }
    
}
