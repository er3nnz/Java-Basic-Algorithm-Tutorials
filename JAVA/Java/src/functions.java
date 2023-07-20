
import java.util.Scanner;

public class functions {


public static void function(int sayi){
    
    
    int faktoriyel=1;
    
    while(sayi>0){
        faktoriyel=faktoriyel*sayi;
        sayi--;
    }
    System.out.println("Girilen sayinin faktoriyeli: "+faktoriyel);
    
}
   /* 
    public static void faktorıyel(){
        
        System.out.println("Lutfen Sisteme Faktoriyelini Hesaplamak Istediginiz Degeri Giriniz");
        Scanner scanner= new Scanner(System.in);
        int sayi=scanner.nextInt();
        int faktoriyel=1;
        
        while(sayi>0){
        faktoriyel=sayi*faktoriyel;
        sayi--;
        }
        System.out.println("Girilen Degerin Faktoriyeli:"+faktoriyel);
    }
    */


    public static void main(String[] args) {
        
        //faktorıyel();
         
        function(5);
    
    }
}
