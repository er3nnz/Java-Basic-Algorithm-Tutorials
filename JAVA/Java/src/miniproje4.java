
import java.util.Scanner;

public class miniproje4 {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Sisteme Birinci Kisa Kenari Giriniz");
        int k1=scanner.nextInt();
        System.out.println("Lutfen Sisteme Ikinci Kisa Kenari Giriniz");
        int k2=scanner.nextInt();
        double u=Math.sqrt(k1*k1+k2*k2);
        System.out.println("Verilen ucgenin hipotenus uzunlugu:"+u);
    }
}

