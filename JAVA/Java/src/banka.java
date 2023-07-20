
import java.util.Scanner;

public class banka {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bakiye=1000;
        
        String Islemler="1.islem  : Bakiye Ogrenme \n"
                        +"2.islem : Para Cekme \n"
                        +"3.islem : Para Yatirma \n"
                        +"Cikis icin q a basin";
        
        System.out.println("********************");
        System.out.println(Islemler);
        System.out.println("********************");
       
        
        while(true){
            
            System.out.println("Islemi Seciniz:\n");
            
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                
                System.out.println("Cikis Yapiliyor....\n");
                break;
            }
            else if(islem.equals("1")){
                    System.out.println("Bakiyeniz:\n"+bakiye);
                    }
            else if(islem.equals("2")){
                
                System.out.println("Lutfen Cekmek Istediginiz Para Miktarini Giriniz\n");
                int cekme=scanner.nextInt();
                
                if(cekme>bakiye){
                    System.out.println("Bakiye Yetersiz\n");
                }
                else{
                    System.out.println("Cekilen Deger:\n"+cekme);
                    System.out.println("Kalan Bakiye:\n"+(bakiye-cekme));
                }
            }
            else if(islem.equals("3")){
                System.out.println("Lutfen Yatirmak istediginiz Degeri Giriniz\n");
                int yatir=scanner.nextInt();
                System.out.println("Yatirilan Miktar:\n"+yatir);
                System.out.println("Hesap Bakiyesi:\n"+(yatir+bakiye));
            }
            else if(!islem.equals(islem)){
                System.out.println("Gecersiz Islem\n");
            }
        }
    }
}
