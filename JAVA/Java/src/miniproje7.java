
import java.util.Scanner;

public class miniproje7 {
    
    public static void main(String[] args) {
        
        System.out.println("****************************************");
        
        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz:\n"
                + "1.Toplama Islemi\n"
                + "2.Carpma Islemi\n"
                + "3.Bolme Islemi\n"
                + "4.Cikarma Islemi");
        
        System.out.println("****************************************");
        
        Scanner scanner=new Scanner(System.in);
       int islem=scanner.nextInt();
        
        System.out.println("Lutfen Sisteme Islem Yapmak Istediginiz 1.Degeri Giriniz");
        int deger1=scanner.nextInt();
        
        System.out.println("Lutfen Sisteme Islem Yapmak Istediginiz 2.Degeri Giriniz");
        int deger2=scanner.nextInt();
        
        switch (islem) {
            
            case 1:
                
                int sonuc=deger1+deger2;
                System.out.println("Girilen Degerlerin Toplami:"+sonuc);
                break;
            
            case 2:
                
                double sonuc2=deger1*deger2;
                System.out.println("Girilen Degerlerin Carpimi:"+sonuc2);
                break;
                
            case 3:
                
                double sonuc3=deger1/deger2;
                System.out.println("Girilen Degerlerin Bolumu:"+sonuc3);
                break;
                
            case 4:
                
                double sonuc4=deger1-deger2;
                System.out.println("Girilen Degerlerin Farki"+sonuc4);
                break;
            
        }
    }
}
