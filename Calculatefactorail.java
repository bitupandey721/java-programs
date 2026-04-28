public class Calculatefactorail {
    public static int factorail(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact=factorail(n-1);
        int fact_n=fact*n;
        return fact_n;
    }
    public static void main(String[] args){
        int n=5;
       int ans= factorail(n);
         System.out.println(ans);
    }
}
