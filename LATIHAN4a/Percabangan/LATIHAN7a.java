
//LATIHAN3.KELULUSAN 2

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN7a {
    public static void main(String[] args) {
        String nama,jenis_kelamin;
        int tinggi_badan;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama = ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis_kelamin = ");
        jenis_kelamin = input.nextLine();
        System.out.print("Masukkan tinggi badan = ");
        tinggi_badan = input.nextInt();
        
        if (("laki laki".equals(jenis_kelamin))){
            if ((tinggi_badan >= 0)&& (tinggi_badan <=170)){
                System.out.println("ANDA GAGAL");
            } else {
                System.out.println("ANDA LULUS");
            }
        } else if (("perempuan".equals(jenis_kelamin))){
            if ((tinggi_badan >= 0)&& (tinggi_badan <=160)){
                System.out.println("Anda GAGAL");
            } else {
                System.out.println("ANDA LULUS");
            }
        }
    }
    
}
