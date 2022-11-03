
package PRAKTIKUM3;

import java.util.Scanner;

public class LATIHAN5 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*10),b = (int)(Math.random()*10),hasil = a + b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Berapakah hasil dari "+a+" dan "+b+"?");
        int jawaban = scan.nextInt();
        
        if(jawaban == hasil){
            System.out.println("Selamat,jawaban anda benar");
        }else {
            System.out.println("Maaf.jawaban yang benar adalah "+hasil);
        }
    }
}
