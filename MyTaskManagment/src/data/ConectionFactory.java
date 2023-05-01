package data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author momed003
 */
public class ConectionFactory {

    
    public static Connection getConnection(){
        try{

            return DriverManager.getConnection("http://localhost/phpmyadmin/index.php?route=/database/structure&db=my_taskmanagment","root","");


        }catch(SQLException error){
             throw new RuntimeException("erro de conexao", error);
        }
    }


}