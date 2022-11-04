
//CONTOH IF-ELSE-IF Halaman 6

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN6NilaiIPK {
    public static void main(String[] args) {
        float nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        nilai = input.nextFloat();
         if(nilai < 3.00){
             System.out.println("CUKUP");
        }else if(nilai < 3.49){
             System.out.println("Memuaskan");
        }else if (nilai < 3.74){
             System.out.println("SANGAT MEMUASKAN");
        }else{
             System.out.println("CUM LAUDE");
        }
    }
}
