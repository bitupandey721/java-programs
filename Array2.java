import java.util.*;
public class Array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        for(int i=0;i<size;i++){//input
            number[i]=sc.nextInt();
        }


        for(int i=0;i<size;i++){//output
            System.out.println(number[i]);
        }

    }
}
