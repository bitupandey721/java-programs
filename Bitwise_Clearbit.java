import java.util.*;

public class Bitwise_Clearbit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = sc.nextInt();

        int bitMark = 1 << pos;
        int notbitmark = ~(bitMark);

        int newnumber = notbitmark & n;

        System.out.println(newnumber);
    }
}
