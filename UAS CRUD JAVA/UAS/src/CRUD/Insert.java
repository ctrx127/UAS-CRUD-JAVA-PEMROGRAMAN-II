
package CRUD;
import java.sql.*;
import javax.swing.JOptionPane;
    public class Insert {
     Koneksi koneksi = new Koneksi ();
     
     public void insert (int kodebuku,String nama, String pengarang, String penerbit, int thnterbit) {
         try {
         koneksi.koneksi();
         Statement statement = koneksi.con.createStatement();
          //insert data
         String sql = "INSERT INTO tb_buku VALUES ('" + kodebuku +
                "','" + nama +
                "','" + pengarang +
                "','" + penerbit +
                "','" + thnterbit + "')";
                statement.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
         }
         catch (Exception ex){
             JOptionPane.showMessageDialog(null,ex);
                }
     }
    
    
}
