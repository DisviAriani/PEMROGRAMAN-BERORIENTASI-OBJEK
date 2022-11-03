
package PRAKTIKUM3;

import java.util.Scanner;
public class SOAL2 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan bulan (angka) : ");
        angka = input.nextInt();
        
        switch(angka){
        case 1 :
            System.out.println("JANUARI");
            break;
        case 2 :
            System.out.println("FEBRUARI");
            break ;
        case 3 : 
            System.out.println("MARET");
            break;
        case 4 : 
            System.out.println("APRIL");
            break;
        case 5 : 
            System.out.println("MEI");
            break;
        case 6 : 
            System.out.println("JUNI");
            break;
        case 7 : 
            System.out.println("JULI");
            break;
        case 8 : 
            System.out.println("AGUSTUS");
            break;
        case 9 : 
            System.out.println("SEPTEMBER");
            break;
        case 10 : 
            System.out.println("OKTOBER");
            break;
        case 11 : 
            System.out.println("NOVEMBER");
            break;
        case 12 : 
            System.out.println("DESEMBER");
            break;
        default :
            System.out.println("Sistem Error");
        }    
    }
}
