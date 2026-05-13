public class PrintMatrix {
    public static void main(String[] args){
        //Creating array
         int arr[][]= new int[2][2];
    arr[0][0]=1;
    arr[0][1]=2;
    arr[1][0]=3;
    arr[1][1]=4;

    for(int i=0;i<=1;i++){
        for(int j=0;j<=1;j++){
            System.out.println(arr[i][j]+" ");
        }
        System.out.println();
    }
 }
}
