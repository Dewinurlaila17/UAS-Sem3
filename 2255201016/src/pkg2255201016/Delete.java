/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2255201016;

import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Delete {
    
    Koneksi konek = new Koneksi();
    
    public void delete(String nama){
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "DELETE FROM `tblpenjualan` WHERE nama ='"+nama+"'";
            statement.executeUpdate(sql);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
