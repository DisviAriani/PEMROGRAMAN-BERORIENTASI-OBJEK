
//IF-ELSE

package LATIHAN4a.Percabangan;

import java.util.Scanner;
public class LATIHAN3Nilaiterbesarinputan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Nilai1,Nilai2,Nilai3;
        System.out.print("Masukkan Nilai1 : ");
        Nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai2 : ");
        Nilai2 = input.nextInt();
        System.out.print("Masukkan Nilai3 : ");
        Nilai3 = input.nextInt();
        
        if ((Nilai1>Nilai2) && (Nilai1> Nilai3))
            System.out.println("Nilai 1 terbesar");
        if ((Nilai2 > Nilai1)&&(Nilai2 > Nilai3))
            System.out.println("Nilai 2 terbesar");
        if ((Nilai3 > Nilai1)&& (Nilai3 > Nilai2))
            System.out.println("Nilai 3 terbesar");
        else
            System.out.println("Semua nilai sama besarnya"); 
    }
}
