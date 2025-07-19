
import java.util.Arrays;

public class binarysearch2d{
    public static void main(String[] args) {
        int[][] arr={{2,3,4},{5,6 ,7,} ,{10 ,55,88}};
        System.out.println(Arrays.toString(binarysearch(arr, 7)));

    }
    static int[] binarysearch(int[][]arr,int target){
        int r =0;
        int c=arr.length-1;

        while(r<arr.length && c>=0){
            ;
            if(arr[r][c]==target){
                return new int[]{r,c};

            }else if(target>arr[r][c]){
                r++;
            }else{
                c--;
                
            }
        }
        return new int[]{-1,-1};
    }
}