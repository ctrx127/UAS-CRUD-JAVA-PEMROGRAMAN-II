
package CRUD;
import java.sql.*;
import javax.swing.JOptionPane;

public class Hapus {
  public void hapus (int kodebuku) {
  Koneksi koneksi = new Koneksi ();
  koneksi.koneksi();
      try {
        Statement statement = koneksi.con.createStatement();
        String sql = "DELETE FROM tb_buku WHERE KodeBuku = '" + kodebuku +"'";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data Sudah dihapus");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
      }
      
  }
    
}
