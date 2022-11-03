
package PRAKTIKUM_2;

import java.util.Scanner;
public class LATIHAN7 {
    public static void main(String[] args) {
        float Desimal;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Masukkan Angka Desimal : ");
        Desimal = inputan.nextFloat();
        System.out.println("Angka yang diinputkan adalah "+Desimal);
    }
}
