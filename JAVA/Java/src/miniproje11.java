public class miniproje11 {
   
    public static int toplam( int a, int b){
        return a+b;
    }
    public static int toplam( int a , int b, int c){
        return a+b+c;
    }
    public static int carp(int a, int b){
        return a*b;
    }
    public static int carp (int a,int b, int c){
        return a*b*c;
    }
    
    public static void main(String[] args) {
        System.out.println(toplam(5, 4));
        System.out.println(toplam(4, 5, 6));
        System.out.println(carp(2, 3));
        System.out.println(carp(2, 3, 4));
    }
}
