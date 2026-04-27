import java.util.*;
public class Bitwise_Getbit {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos=sc.nextInt();
    int bitMark=n<<pos;

    if((bitMark &n)==0){
 System.out.println("Bit was zero");
    }
    else{
        System.out.println("Bit was one");
    }
   
}
}
