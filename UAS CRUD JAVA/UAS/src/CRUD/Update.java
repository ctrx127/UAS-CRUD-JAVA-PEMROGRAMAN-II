
package CRUD;
import java.sql.*;
import javax.swing.JOptionPane;
public class Update {
    public void update (String namabuku,String pengarang,String penerbit,int tahun,int kode) {
    Koneksi koneksi = new Koneksi();
    koneksi.koneksi();
        try {
            Statement statement = koneksi.con.createStatement();
            String update = "UPDATE tb_buku SET NamaBuku = '" + namabuku +
                    "',Pengarang = '" + pengarang +
                    "',Penerbit ='" + penerbit + 
                    "',TahunTerbit = '" + tahun + 
                    "'WHERE KodeBuku = '" + kode + "'";
            statement.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "Data Telah Diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    }
}
