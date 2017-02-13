/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ChipZero
 */
public class DBUtility {
    public static Connection ConnectDatabase(){
        Properties p = new Properties();
        File file = new File("config.properties");
        try {
            if(!file.exists()){
                file.createNewFile();
                p.setProperty("serverName", "localhost");
                p.setProperty("dbName", "atm");
                p.setProperty("port", "1433");
                p.setProperty("userName", "sa");
                p.setProperty("password", "1234567");
                FileOutputStream fos = new FileOutputStream(file);
                p.store(fos, "");
                fos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        InputStream input = null;
        try {
            input = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            p.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String userName = p.getProperty("userName");
        String password = p.getProperty("password");
        String port = p.getProperty("port");
        String dbName = p.getProperty("dbName");
        String serverName = p.getProperty("serverName");
        String url = "jdbc:sqlserver://" + serverName + ":" + port;
        Connection conn = null;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url + ";databasename=" + dbName, userName, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }
    public static void closeAll(Connection cnn, Statement stmt, PreparedStatement psmt, CallableStatement csmt) {
        try {
            if (cnn != null) {
                cnn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (psmt != null) {
                psmt.close();
            }
            if (csmt != null) {
                csmt.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void main(String[] args) {
       System.out.println(ConnectDatabase());
    }
}
