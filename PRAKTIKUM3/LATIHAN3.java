
package PRAKTIKUM3;

import java.util.Scanner;
public class LATIHAN3 {
    public static void main(String[] args) {
        String jawaban,jawaban1;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Apakah anda mahasiswa ? (iya)");
        jawaban = scan.next();
        
        if ("iya".equals(jawaban) || ("IYA".equals(jawaban))){
            System.out.println("Apakah anda selalu terlambat masuk kelas ? ");
            jawaban1 = scan.next();
            
            if(("tidak".equals(jawaban1) || ("TIDAK".equals(jawaban1)))){
                System.out.println("Bagus,pertahankan !!!!");
            }
        }
    }
}
