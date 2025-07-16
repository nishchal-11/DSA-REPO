

public class shadowing{
    static int x =90;
    public static void main(String[] args) {
       System.out.println(".()"+x);
       int x = 2;
       System.out.println(x);
       sex();

    }
    static void sex(){
        System.out.println(x);
    };
    
    }
