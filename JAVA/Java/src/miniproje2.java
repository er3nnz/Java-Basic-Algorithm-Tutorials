
import java.util.Scanner;


public class miniproje2 {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Sisteme Aracinizin Km de kac tl yaktigini giriniz");
        double kmTl=scanner.nextDouble();
        System.out.println("Lutfen Sisteme kac km gideceginizi giriniz");
        int km=scanner.nextInt();
        double sonuc=kmTl*km;
        System.out.println("Aracinizin gidilen yol boyu yaptigi harcama:"+sonuc+"....");
    }
}
