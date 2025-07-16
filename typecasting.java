import java.util.Scanner;
public class typecasting{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= 23597;
        int count=0;
        while(n>0){
            int rem =n%10;
            count =count*10+rem;
            n=n/10;
        }
        System.out.println(count);
       
    }
}
