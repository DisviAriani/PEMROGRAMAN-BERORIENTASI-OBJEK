
package PRAKTIKUM_2;


import java.util.Scanner;
public class SOAL3 {
    public static void main(String[] args) {
        String Nama;
        String NIM;
        String Semester;
        String Kelas;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama     = ");
        Nama = input.nextLine();
        System.out.print("Masukkan NIM      = ");
        NIM = input.nextLine();
        System.out.print("Masukkan Semester = ");
        Semester = input.nextLine();
        System.out.print("Masukkan Kelas    = ");
        Kelas = input.nextLine();

        System.out.println("----------HASIL----------");
        System.out.println("Nama     = "+Nama);
        System.out.println("NIM      = "+NIM);
        System.out.println("Semester = "+Semester);
        System.out.println("Kelas    = "+Kelas);
    }
}
