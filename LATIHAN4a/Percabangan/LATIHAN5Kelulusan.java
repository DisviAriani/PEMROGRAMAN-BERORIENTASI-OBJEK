
//IF-ELSE 
//(LATIHAN1.KELULUSAN1) HALAMAN 5

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN5Kelulusan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String Nama,NIM;
        int nilai;
        
        System.out.print("Masukkan nama anda = ");
        Nama = input.nextLine();
        
        System.out.print("Masukkan NIM = ");
        NIM = input.nextLine();
        
        System.out.print("Masukkan Nilai = ");
        nilai = input.nextInt();
        
        if(nilai > 55){
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }
    }
    
}
