/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoneksiDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SYARIF
 */
public class KoneksiDB {
    public Connection getConnection() { 
try { 
return DriverManager.getConnection("jdbc:mysql://localhost/konter","root",""); 
} catch (SQLException e) { 
throw new RuntimeException(e);
} 
} 
}
