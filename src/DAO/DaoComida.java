/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Comida;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Andrés
 */
public class DaoComida {
    
    public static void agregar(Comida comida){
        String query = "INSERT INTO Comida (comida) values('"+comida.getComida()+"')";
        Operaciondb.setDataOrDelete(query, "comida agregada correctamente ");
    }
    public static ArrayList<Comida> getAllRecords(){
        ArrayList<Comida> arrayList = new ArrayList<>();
        try{
            ResultSet rs = Operaciondb.getData("SELECT * FROM comida");
            while(rs.next()){
                Comida comida = new Comida();
                comida.setId(rs.getInt("id"));
                comida.setComida(rs.getString("comida"));
                arrayList.add(comida);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void eliminar(String comida){
        String query = "DELETE FROM comida WHERE comida='"+comida+"'";
        Operaciondb.setDataOrDelete(query, "comida eliminada correctamente ");
    }
    
}
