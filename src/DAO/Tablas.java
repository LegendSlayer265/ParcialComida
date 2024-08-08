/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés
 */
public class Tablas {
    public static void main(String[] args) {
        try{
            String comidaTable = "CREATE TABLE `comida`(id int AUTO_INCREMENT primary key, comida varchar(30), UNIQUE(comida))";
            Operaciondb.setDataOrDelete(comidaTable, "Tabla Comida creada correctamente ");
            String pedidoTable = "CREATE TABLE `pedido`(id int AUTO_INCREMENT primary key, comida varchar(30), UNIQUE(comida))";
            Operaciondb.setDataOrDelete(pedidoTable, "Tabla Pedido creada correctamente ");
            
            
            //String userTable = "CREATE TABLE `usuarios`(id int AUTO_INCREMENT primary key, name varchar(30), username varchar(50), password varchar(60), status varchar(20), UNIQUE(username))";
            //String DetallesAdmin = "INSERT INTO `usuarios`(name, username, password, status) VALUES('Admin', 'Admin', 'Admin', 'true') ";
            //String CategoryTable = "CREATE TABLE `category`(id int AUTO_INCREMENT primary key, Categoria varchar(50), UNIQUE(Categoria))";
            //Operaciondb.setDataOrDelete(CategoryTable);
            //String ProductsTable = "CREATE TABLE `products`(id int AUTO_INCREMENT primary key, Producto varchar(50), Categoria varchar(50), Cantidad tinyint, Precio int, UNIQUE(Producto))";
            //Operaciondb.setDataOrDelete(ProductsTable, "Tabla Usuarios creada correctamente ");
            //Operaciondb.setDataOrDelete(DetallesAdmin, "Detalles de Administrador agregados correctamente ");
            //Operaciondb.setDataOrDelete(userTable, "Tabla Usuarios creada correctamente ");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
