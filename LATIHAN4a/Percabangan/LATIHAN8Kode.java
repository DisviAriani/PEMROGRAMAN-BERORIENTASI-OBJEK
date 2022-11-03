
//SWITCH-CASE Halaman 8
//Contoh 

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN8Kode {
    public static void main(String[] args) {
        int kode;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan kode : ");
        kode = input.nextInt();
        
        switch(kode){
        case 1 :
            System.out.println("IPA");
            break;
        case 2 :
            System.out.println("IPS");
            break ;
        case 3 : 
            System.out.println("BHS");
            break;
        }
    }
}
