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
public class Update {

    Koneksi konek = new Koneksi();

    public void update(String nama, String jenis, String custom, String alamat) {

        try {
            konek.koneksi();

            Statement statement = konek.con.createStatement();
            String sql_nama = "UPDATE tblpenjualan SET nama = '" + nama + "',jenis = '" + jenis + "',custom = '" + custom + "',alamat = '" + alamat + "'";
            //String sql_nama = "UPDATE tblpenjualan SET nama = '" + nama + "',jenis = '" + jenis + "',custom = '" + custom + "',alamat = '" + alamat + "'";

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
