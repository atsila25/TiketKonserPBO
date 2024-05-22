package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class koneksi {
    private static Connection koneksi;
    public static Connection getkoneksi(){
        if (koneksi==null){
        try {
           String url = new String(); 
           String user = new String();
           String password  = new String();
           url ="jdbc:mysql://Localhost:3306/db_login";
           user ="root";
           password = "";
           DriverManager.registerDriver(new java.sql.Driver() {
               @Override
               public Connection connect(String string, Properties prprts) throws SQLException {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
               @Override
               public boolean acceptsURL(String string) throws SQLException {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
               @Override
               public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
               @Override
               public int getMajorVersion() {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
               @Override
               public int getMinorVersion() {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
               @Override
               public boolean jdbcCompliant() {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
               @Override
               public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
           });
           koneksi = (Connection) DriverManager.getConnection(url, user , password);
        } catch (SQLException t) {
            System.out.println("Koneksi Error!!");
        }
        }
        return koneksi;
    }
}