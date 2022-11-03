
package PRAKTIKUM_2;

import java.util.Scanner;
public class LATIHAN5 {
    public static void main(String[] args) {
        String nama;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama = inputan.next();
        System.out.println("Halo..."+nama+",Selamat belajar java");
    }
}
