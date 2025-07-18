
import java.util.Arrays;

public class linearsearch2d{
    public static void main(String[] args) {
        int[][] nums ={{23,23 ,44},{34,8,7},{91,0,8}};
        int target= 44;
        int[] ans = linear(nums,target);
        System.out.println(Arrays.toString(ans));
        
    }
            static int linear(int [][]arr, int target){
                    
                    for( int i=0;i<arr.length;i++){
                        for(int j =0;j<arr[i].length;j++){
                                if(arr[i][j]==target){
                                return new int[]{i,j};
                        }
            }
            
        }
        return new int[]{-1,-1};
    }
}

