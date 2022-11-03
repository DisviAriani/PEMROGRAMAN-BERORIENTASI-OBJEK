
//IF- ELSE-IF (LATIHAN2.NILAI HURUF) Halaman 7 

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN6a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.print("Masukkan Nilai = ");
        nilai = input.nextInt();
        
        if ((nilai >= 0)&&(nilai <= 56)){
          System.out.println("Nilai anda : E");  
        } else if ((nilai >= 56)&&(nilai <= 65)){
          System.out.println("Nilai anda : D");  
        } else if ((nilai >= 66)&& (nilai <= 75)){
          System.out.println("Nilai anda : C");  
        } else if ((nilai>=76)&&(nilai <= 85)){
          System.out.println("Nilai anda : B");  
        } else if ((nilai >= 86)&&(nilai <= 100)){
          System.out.println("Nilai anda : A");   
        } else {
          System.out.println("ERORR");   
        }
    }
}