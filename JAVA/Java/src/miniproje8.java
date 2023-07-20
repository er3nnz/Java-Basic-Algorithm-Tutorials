
import java.util.Scanner;

public class miniproje8 {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Lutfen Sisteme Ogrencinin Ilk Vizesinin Notunu Giriniz:");
        int vize1=scanner.nextInt();
        
        System.out.println("Lutfen Sisteme Ogrencinin Ikinci Vizesinin Notunu Giriniz:");
        int vize2=scanner.nextInt();
        
        System.out.println("Lutfen Sisteme Ogrencinin Final Notunu Giriniz");
        int finalNot=scanner.nextInt();
        
        System.out.println("Lutfen Sisteme Okul Ortalamasini Giriniz:");
        int okulOrt=scanner.nextInt();
        
        
        double ort=(vize1*0.3)+(vize2*0.3)+(finalNot*0.4);
        
        
        if(ort>=90){
            System.out.println("AA");
        }
        else if(ort>=80){
            System.out.println("AB");
        }
        else if(ort>=70){
            System.out.println("AC");
        }
        else if(ort>=60){
            System.out.println("BA");
        }
        else if(ort>=50){
            System.out.println("BB");
            
            if(okulOrt<2.50){
                System.out.println("Ortalamanız 2.50 altinda kalmistir lutfen derslerinize daha cok onem veriniz");
            }
        }
        else{
            System.out.println("Ogrenci Dersten Kalmistir");
        }
    }
    
}
