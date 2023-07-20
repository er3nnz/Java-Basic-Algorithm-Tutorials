
import java.util.Scanner;

public class miniproje10 {
    
    public static void ebobBul(){
        int a;
        int b;
        System.out.println("Lutfen Ebobunu Bulmak Istediginiz Degerlerden Ilkini Giriniz");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("Lutfen Ebobunu Bulmak Istediginiz Degerlerden Ikincisini Giriniz");
        b=scanner.nextInt();
        if(b>a){
            for(int i=2;i<b;i++){
                if(a%i==0 && b%i==0){
                    System.out.println("Girilen Degerlerin ebobu:"+i);
                }
            }
        }
        else if(a>b){
         for(int i=0;i<a;i++){
             if(a%i==0 && b%i==0){
                    System.out.println("Girilen Degerlerin ebobu:"+i);
                }
            }
        }
        else if(a==b){
         for(int i=0;i<a;i++){
             if(a%i==0 && b%i==0){
                    System.out.println("Girilen Degerlerin ebobu:"+i);
                }
            }
} 
    
}
    
    
    public static void main(String[] args) {
        
        ebobBul();
    }
}    
            
       
        


