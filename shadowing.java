
public class shadowing{
    public static void main(String[] args) {
      int a =153;
      int sum =0;
      while(a>0){
        int rem=a%10;
        a=a/10;
        int cube= rem*rem*rem;
        sum += cube;
        if(sum==a){
        System.out.println("true");
    }
      }
    }
}