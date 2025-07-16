
import java.util.Scanner;

public class functions{
    public static void main(String[] args) {
        int ans =display();
        System.out.println(ans);
    }
    static int display(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1");
        int num1= in.nextInt();
        System.out.println("enter 2");
        int num2= in.nextInt();
        int sum= num1+num2;
        return sum;
    }
}