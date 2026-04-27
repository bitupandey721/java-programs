import java.util.*;
public class Factriol {
    public static void printfactriol(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factriol of number is: ="+fact);
        return;
    }
    

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printfactriol(n);
}
}