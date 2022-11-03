
//CONTOH IF DALAM IF

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN7KriteriaLulus {
    public static void main(String[] args) {
       
        String jurusan;
        float nilai;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jurusan (IPA/IPS) =  ");
        jurusan = input.nextLine();
        
        System.out.print("Masukkan Nilai = ");
        nilai = input.nextFloat();
        
        if ("IPA".equals(jurusan)){
            if(nilai >= 8.5){
                System.out.println("Anda Lulus");
            } else {
                System.out.println("Anda tidak lulus");
            }
        }else if ("IPS".equals(jurusan) ){
            if (nilai >= 7.5){
                System.out.println("Anda lulus");
            }else {
                System.out.println("Anda tidak lulus");
            }
        }
    }
 
}
