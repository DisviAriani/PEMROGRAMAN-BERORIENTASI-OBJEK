
package PRAKTIKUM_2;

import java.util.Scanner;
public class LATIHAN8 {
    public static void main(String[] args) {
        String Nama1,Nama2;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap Anda: ");
        Nama1 = inputan.nextLine();
        System.out.println("Halo..."+Nama1+",ini adalah penggunaan nextLine()");

        System.out.print("Masukkan Nama Lengkap Anda : ");
        Nama2 = inputan.next();
        System.out.println("Halo..."+Nama2+",ini adalah penggunaan next()");
    }
}
