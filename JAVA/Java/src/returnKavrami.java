public class returnKavrami {
    
    //return bir fonksiyonda kullanılan değeri diğer fonksiyonda kullanabilmek için şarttır...
    
    //aynı name a ait fonksyionların birden fazla fonksiyonu olabilir....ve birden fazla işlem yapabilir...
    
    public static int aKare(int a){
        return a*a;
    }
    
    public static int btoplam( int b){
        
        return b+b;
    }
    /////////////////////////////////////////////////////////////
    
    
    public static int toplama(int a, int b, int c){
        
        return(a+b+c);
    }
    
    public static void main(String[] args) {
        
        //return mantıgı
         int c=btoplam(aKare(8));
         System.out.println(c);
        
         
         
        int a=toplama(3, 4, 5);
        System.out.println(a);
        System.out.println(toplama(3, 4, 5));
        
    }
}
