
import java.util.Scanner;

public class scanner {
    
    public static void main(String[] args) {
        
       Scanner scanner=new Scanner(System.in);//scanf nesnesini oluşturuyoruz//
       
        System.out.println("Lutfen Yasinizi Giriniz");
     
        int yas=scanner.nextInt();
        System.out.println("Yasiniz:"+yas);
    }
}
