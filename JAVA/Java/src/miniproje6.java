import java.util.Scanner;

public class miniproje6 {
  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
         System.out.println("Lutfen Sisteme Kilonuzu Giriniz");
        int kilo=scanner.nextInt();
        
        
        System.out.println("Lutfen Sisteme Boyunu Giriniz Orn (1.72)");
        double boy=scanner.nextDouble();
        
        
        double endeks=kilo/(boy*boy);
        
        if(endeks<18.5){
            System.out.println("Girilen Bilgilere Gore Vucut Endeks Degeriniz: Zayiftir");
        }       
        else if(endeks>18.5 && endeks<25){
            System.out.println("Girilen Bilgilere Gore Vucut Endeks Degeriniz: Normal");
        }
        else if(endeks>25 && endeks<30){
            System.out.println("Girilen Bilgilere Gore Vucut Endeks Degeriniz: Kilolu");
        }
        else if(endeks>30){
            System.out.println("Girilen Bilgilere Gore Vucut Endeks Degeriniz: Obez");
        }
    }
}
