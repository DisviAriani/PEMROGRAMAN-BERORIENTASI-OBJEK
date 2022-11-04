
package LATIHAN;

import java.util.Scanner;
public class ZODIAK {
    public static void main(String[] args) {
        int zodiak;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai = ");
        zodiak = input.nextInt();
        
        switch (zodiak){
            case 0 :
                System.out.println("Zodiak : ARIES");
                break;
            case 1 :
                System.out.println("Zodiak : LEO");
                break;
            case 2 :
                System.out.println("Zodiak : AQUARIUS");
                break;
            case 3 : 
                System.out.println("Zodiak : PISCES");
                break;
            case 4 :
                System.out.println("Zodiak : TAURUS");
                break;
            case 5 :
                System.out.println("Zodiak : GEMINI");
                break;
            case 6 :
                System.out.println("Zodiak : CANCER");
                break;
            case 7 :
                System.out.println("VIRGO");
                break;
            case 8 :
                System.out.println("LIBRA");
                break;
            case 9 :
                System.out.println("SCORPIO");
                break;
            case 10 :
                System.out.println("SAGITARIUS");
                break;
            case 11 :
                System.out.println("CAPRICORN");
                break;
        }
        
        
    }
}
