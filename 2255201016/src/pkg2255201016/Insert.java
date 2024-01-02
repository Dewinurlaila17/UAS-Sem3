/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2255201016;

import pkg2255201016.Koneksi;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(String nama, String jenis_kue, String custom_kue, String alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
//          String sql = "insert into tblpenjualan (nama, jenis, custom, alamat) " + "values('" + nama + "','" + jenis_kue + "','" + custom_kue + "','" + alamat + "')";
            String sql = "insert into tblpenjualan (nama, jenis, custom, alamat) " + "values('" + nama + "','" + jenis_kue + "','" + custom_kue + "','" + alamat + "')";
            statement.executeUpdate(sql);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
