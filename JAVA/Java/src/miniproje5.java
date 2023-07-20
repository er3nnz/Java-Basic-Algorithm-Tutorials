
import java.util.Scanner;

public class miniproje5 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        int deger1=scanner.nextInt();
        int deger2=scanner.nextInt();
        int deger3=scanner.nextInt();
        
        if(deger2>deger1 && deger2>deger3){
         
            System.out.println("Girilen Değerlerden En buyuk Deger:"+deger2);
        }
        else if(deger3>deger1 && deger3>deger2){
            
            System.out.println("Girilen Degerlerden En Buyuk Deger:"+deger3);
        }
        
        System.out.println("Girilen Degerlerden Birincisi:"+deger1+ " "+ "Ikinci Deger:"+deger2+ " " + "Ucuncu Deger:"+deger3);
    }
    
}
