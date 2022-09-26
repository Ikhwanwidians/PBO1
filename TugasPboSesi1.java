/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbosesi1;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class TugasPboSesi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nomor 1
        System.out.println("belajar JAVA");
        System.out.println("Sangat Mudah Sekalii");
        System.out.println("Dan Sangat Menyenangkan");
        
        //Nomor 2
        String respon;
        respon = JOptionPane.showInputDialog("Anda sedang belajar apa");
        
        JOptionPane.showMessageDialog(null, "Belajar "+ respon +" Sangat Mudah");
        
    }
    
}
