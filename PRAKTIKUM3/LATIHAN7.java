
package PRAKTIKUM3;

import java.util.Scanner;
public class LATIHAN7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Siapakah presiden pertama Indonesia ?");
        System.out.println("a.Dr.Ir.H.Soekarno");
        System.out.println("b.B.J.Habibie");
        System.out.println("c.Megawati Soekarno Putri");
        System.out.println("d.Abdurrahman Wahid");
        
        System.out.print("Jawab : ");
        
        char pilih = scan.next().charAt(0);
        switch (pilih){
            case 'a' :
                System.out.println("Benar !");
                break;
            case 'b' :
                System.out.println("Salah,jawabannya adalah Dr.Ir.Soekarno");
                break;
            case 'c' :
                System.out.println("Salah,jawabannya adalah Dr.Ir.Soekarno");
                break;
            case 'd' :
                System.out.println("Salah,jawabannya adalah Dr.Ir.Soekarno");
                break;
            default :
                System.out.println("Sistem error");
        }
    }
}
