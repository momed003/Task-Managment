package data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author momed003
 */
public class ConectionFactory {
    
    private final static String DRIVER="com.mysql.jdbc.Driver";
    private final static String URL="jdbc.mysql://localhost:3306/my_taskmanagment";
    private final static String USER="root";
    private final static String PASS="";
    
public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
                    
        } catch (ClassNotFoundException | SQLException ex) {
               throw new RuntimeException("202-Erro de conexao: ", ex);
        }
    
}


//serve para fechar a conexao entra o app e a bd
public static void closeConection(Connection com){
    
    
   try {
              //se a  conexao estiver aberta: 
            if (com!=null) {
                com.close();
                           }
        
        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public static void closeConection(Connection com,PreparedStatement ps){
       closeConection(com);
    
   try {
              //se a  conexao estiver aberta: 
            if (ps!=null) {
                ps.close();
                           }
        
        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
public static void closeConection(Connection com,PreparedStatement ps, ResultSet rs){
       closeConection(com, ps);
    
   try {
              //se a  conexao estiver aberta: 
            if (rs!=null) {
                rs.close();
                           }
        
        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
