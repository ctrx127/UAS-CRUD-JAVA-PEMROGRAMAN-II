
package CRUD;

    import java.sql.*;
    import javax.swing.JOptionPane;

public class Koneksi {
    Connection con ;
    String teskoneksi = null;
    
    public Connection koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/db_buku";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           teskoneksi = "Berhasil";
           return con;
        }

        catch(Exception e)
        {
        teskoneksi = "Gagal";
        JOptionPane.showMessageDialog(null, "Terjadi Error Koneksi Ke Database");
        }
        return null;
}

}