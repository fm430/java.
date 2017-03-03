import java.util.Scanner;

    public class MerhabaDunya {


        public static void main(String[] args) {

                Scanner d = new Scanner(System.in);
                System.out.println("Birinci(a) sayı giriniz:");
                int a = d.nextInt();
                System.out.println("İkinci(b) sayı giriniz:");
                int b = d.nextInt();
                System.out.println("Üçüncü(c) sayı giriniz");
                int c = d.nextInt();

                if (a>b && a<c){
                      System.out.println("a, b ile c arasında bir sayıdır");              
                }
                else {
                      System.out.println("a, b ile c arasında bir sayı değildir");  
                }
                if (a>b || a>c){
                   System.out.println("a,b veya c' den daha büyüktür");
                }
                else {
                   System.out.println("a,b veya c' den daha büyük değildir");
                }
                if (a==b && a<c ){
                   System.out.println("a,b'ye eşit ve aynı zamanda c'den küçüktür");
                }
                else {
                   System.out.println("a,b'ye eşit değil");
                }
                if (a==b && b==c && a==c){
                    System.out.println("üç sayı birbirine eşittir.");
                }
                else {
                    System.out.println("üç sayı birbirine eşit değildir.");
                }

                    }      
        }
