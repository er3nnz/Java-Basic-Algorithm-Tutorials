
import java.util.Scanner;

public class miniproje1 {
  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Sisteme kilonuzu giriniz");
        int kilo=scanner.nextInt();
        System.out.println("Lutfen Sisteme Boyunuzu Giriniz(Orn:1,72)");
       double boy=scanner.nextDouble();
        double endeks=kilo/(boy*boy);
        System.out.println("Girilen Boy & Kilo Degerlerinin Endeksi:"+endeks);
    }
}
