//print number from 1 to 5
public class Recursion1 {
    public static void printNumb(int n){
        if(n==6){
            return;
        }
        System.out.print(n +" ");
        printNumb(n+1);
    }
    public static void main(String[] args){
        int n=1;
        printNumb(n);//n=1
    }
}
