/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés
 */
public class Coneccion {
    private static Connection con;
    
    public static Connection getCon(){
        if(con == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioncomida", "root" , "");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
        }
        return con;
    }
}
