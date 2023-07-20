
import java.util.Scanner;

public class miniproje3 {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=5;
        int gecici;
        int b=8;
        
        gecici=a;
        a=b;
        b=gecici;
        System.out.println(a);
        System.out.println(b);
    }
}
