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
        public static void pedir(Comida comida){
        String query = "INSERT INTO Pedido (comida) values('"+comida.getComida()+"')";
        Operaciondb.setDataOrDelete(query, "comida pedida correctamente ");
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
    public static ArrayList<Comida> getSomeRecords(){
        ArrayList<Comida> arrayList = new ArrayList<>();
        try{
            ResultSet rs = Operaciondb.getData("SELECT * FROM Pedido");
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
    
    public static Comida getComidaByName(String name){
        Comida comida = null;
        try{
            ResultSet rs = Operaciondb.getData("SELECT * FROM comida WHERE comida = '"+name+"'");
            if(rs.next()){
                comida = new Comida();
                comida.setId(rs.getInt("id"));
                comida.setComida(rs.getString("comida"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return comida;
    }
    
}
