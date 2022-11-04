
package LATIHAN4a.InputDariKeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LATIHAN2InputDariBufferedReader {
    public static void main(String[] args) {
        BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));
        
        try {
            System.out.print("NAMA = ");
            String nama = br1.readLine();
            
            System.out.print("UMUR = ");
            int umur = Integer.parseInt(br1.readLine());
            
            System.out.println("Assalamualaikum " + nama + "."
                    + "Apa kabar ? tidak terasa sekarang anda sudah " + umur + " tahun.");
            
        }catch (IOException ex){
            System.out.println("Erorr pada saat input data");
        }
    }
}
