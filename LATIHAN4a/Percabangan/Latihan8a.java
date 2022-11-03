
//LATIHAN4.BOBOT NILAI HURUF (Halaman 8)

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class Latihan8a {
    public static void main(String[] args) {
        char nilaihuruf;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan huruf = ");
        nilaihuruf = input.next().charAt(0);
        
        switch(nilaihuruf){
            case 'A' :
                System.out.println("0");
                break;
            case 'B' :
                System.out.println("1");
                break;
            case 'C':
                System.out.println("2");
                break;
            case 'D':
                System.out.println("3");
                break;
            case 'E':
                System.out.println("4");
                break;
        } 
    }
}
