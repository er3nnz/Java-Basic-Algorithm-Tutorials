
import java.util.Scanner;

public class kullanıcı {
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String kullanıcı="Eren";
        int hak=3;
        String sıfre="Jg421VT8";
        
        while(true){
            
            System.out.println(" Lutfen Sisteme Kullanici Adinizi Giriniz:");
            String kullanıcıad=scanner.nextLine();
        
             System.out.println(" Lutfen Sisteme Sifrenizi Giriniz:");
             String sifre=scanner.nextLine();
        
        
            if(kullanıcıad.equals(kullanıcı) && sifre.equals(sıfre)){
                System.out.println(" Kullanici Bilgileri Dogrudur...\n Hosgeldiniz:"+kullanıcıad+"bey");
                break;
            }
            else if(kullanıcıad.equals(kullanıcı) &&  !sifre.equals(sıfre)){    
                System.out.println("Kullanicin Adi Dogrudur Lakin Sifresi Yanlistir..\n Tekrar Bilgilerinizi Giriniz");
                hak-=1;
            }
            else if(!kullanıcıad.equals(kullanıcı) && sifre.equals(sıfre)){
                System.out.println("Kullanicinin Sifresi Dogrudur Lakin Kullanici Adi Yanlistir\n\nTekrar Bilgilerinizi Giriniz\n");
                hak-=1;
            }
            else{
                System.out.println(" Kullanici Bilgilerinin Hepsi Yanlistir\n Lutfen Tekrar Giriniz");
                hak-=1;
            }
             if(hak==0){
                    System.out.println("Sisteme Yanlis Giris Hakkiniz Dolmustur");
                    break;
                }
            
        }
    }
}
