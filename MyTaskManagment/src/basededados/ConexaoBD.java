/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basededados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marino Ricardo
 */
public class ConexaoBD {
        public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/task_management","root","");
        }catch(SQLException error){
             throw new RuntimeException(error);
        }
    }
}
