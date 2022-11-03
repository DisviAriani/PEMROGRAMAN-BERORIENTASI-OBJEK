
package PRAKTIKUM3;

import java.util.Scanner;
public class LATIHAN4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Apakah anda mahasiswa ITS MANDIRI,Disvi Ariani ? (Y jika setuju)");
        String jawaban = scan.next();
        
        if("Y".equals(jawaban)){
            System.out.println("Selamat berjuang di ITS MANDIRI,Disvi Ariani");
        }else {
            System.out.println("Selamat datang di ITS MANDIRI,Disvi Ariani");
        }
    }   
}
