import java.util.*;
public class Greet {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int button = Sc.nextInt();

        if (button==0){
            System.out.println("hello");
        }
        else if(button==1){
            System.out.println("Nameste");
        }
            else if(button==2){
                System.out.println("bonjour");
            }
            else{
                System.out.println("inviald button");
            }
        }

    }

