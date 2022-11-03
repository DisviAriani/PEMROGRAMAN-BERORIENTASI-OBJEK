
package LATIHAN4a.InputDariKeyboard;

import javax.swing.JOptionPane;
public class LATIHAN3InputDariJOptionPane {
    public static void main(String[] args) {
        //input nama
        String nama = JOptionPane.showInputDialog("Masukkan nama anda !");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda !"));
        
        System.out.println("Hai " + nama + ", apa kabar ? tidak terasa sekarang anda sudah " + umur + " tahun.");
    }
}
