
import java.util.Arrays;
import java.util.Scanner;

public class arrays{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int[] b: arr) {
            
            System.out.println(Arrays.toString(b));
            System.out.println();
        }
        
        
    }
}