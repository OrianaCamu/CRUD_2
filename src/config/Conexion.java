/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Guillermo
 */
public class Conexion {
    Connection con;
    public Conexion (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","root");
            
            
            
        } catch (Exception e) {
        }
    }
    public Connection getConnection(){
        return con;
        
    }
}
