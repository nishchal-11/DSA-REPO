import java.util.Scanner;
public class arraylist{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr={1,2,3,4};
    
        System.out.println(max(arr,1,2));
    }
    static int max(int[] arr,int s,int e){
        int maxv =arr[s];
        for(int i =s;i<=e;i++){
            
            if(arr[i]>maxv){
                maxv=arr[i];
            }
        }
        return maxv;
    }
}