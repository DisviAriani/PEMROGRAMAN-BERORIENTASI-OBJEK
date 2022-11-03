
package PRAKTIKUM3;

import java.util.Scanner;
public class SOAL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan,sisi,luas_persegi,keliling_persegi;
        
        System.out.println("PILIH METODE");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling persegi");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 :
                System.out.println("----------------------------------");
                System.out.print("Masukkan panjang sisi persegi : ");
                sisi = input.nextInt();
                luas_persegi = sisi*sisi;
                System.out.println("Luas persegi adalah : "+luas_persegi+" cm");
                break;
            case 2 :
                System.out.println("-----------------------------------");
                System.out.print("Masukkan panjang sisi persegi : ");
                sisi = input.nextInt();
                keliling_persegi = 4*sisi;
                System.out.println("Keliling Persegi adalah : "+keliling_persegi+" cm");
                break;
            default :
                System.out.println("Sistem error");
        }
    }
}
