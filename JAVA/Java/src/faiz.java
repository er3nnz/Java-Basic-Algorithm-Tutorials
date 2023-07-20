
import java.util.Scanner;

public class faiz {
    
    public static void main(String[] args) {
        System.out.println("Lutfen Sisteme Mevcut Paranizi Giriniz");
        Scanner scanner= new Scanner(System.in);
        double para=scanner.nextDouble();
        
        int i=0;
        while(i<=6){
            double faiz=0.06;
            para=(para*faiz)+para;
           System.out.println("Bankaya Yatirilan Paranizin "+i+ "Yil Sonu Toplam Degeri :"+para);
           i++;
        }
        
    }
}
