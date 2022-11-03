
//LATIHAN5.OPERATOR No. 2

package LATIHAN3a;


public class LATIHAN7a {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        
        int Hasil1 = (n1 + n2)* (n2 + n1);
        int Hasil2 = (n1 / 4) * n2;
        
        boolean b1 = Hasil1 >= Hasil2;
        boolean b2 = Hasil2 >= Hasil1;
        boolean b3 = (Hasil1 % 4)==(++Hasil2 % 5);
        boolean b4 = (b1 ^ b3)&&(b2 || b3);
        boolean b5 = b2 || (b3 && (b2 ^ b1));
        
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
    }
 
}
