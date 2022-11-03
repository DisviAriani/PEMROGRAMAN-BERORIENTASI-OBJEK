
package LATIHAN;

import java.util.Scanner;
public class DISKON_BELANJA {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Total_Belanja,total;
        int diskon;
        int Harga_Akhir;
        
        System.out.print("Masukkan Total Belanja = Rp.");
        Total_Belanja = input.nextInt();
        
        if (Total_Belanja <= 100000){
            System.out.println("MAAF ANDA TIDAK MENDAPAT DISKON");
        }
        else if ((Total_Belanja >=100000)&&(Total_Belanja < 500000)){
            diskon = Total_Belanja*10/100;
            total = Total_Belanja - diskon;
            System.out.println("Selamat anda mendapatkan diskon 10 %");
            System.out.println("----------------------------------------");
            System.out.println("Harga Akhir = Rp."+total);
        }
        else if ((Total_Belanja >=500000)&&(Total_Belanja < 1000000)){
            diskon= Total_Belanja*20/100;
            total = Total_Belanja - diskon;
            System.out.println("Selamat anda mendapat diskon 20%");
            System.out.println("-----------------------------------------");
            System.out.println("Harga Akhir = Rp."+total);
        }
        else if ((Total_Belanja >=1000000)){
            diskon = Total_Belanja*30/100;
            total = Total_Belanja - diskon;
            System.out.println("Selamat anda mendapatkan diskon 30%");
            System.out.println("-----------------------------------------");
            System.out.println("Harga Akhir = Rp."+ total);
        }
        
    }
}
