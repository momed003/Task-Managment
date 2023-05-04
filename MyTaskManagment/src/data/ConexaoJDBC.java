package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoJDBC {
    public static String status="404-not found";

    public ConexaoJDBC(){}//construtor da classe

    public   static  java.sql.Connection getConneection() {
        Connection conexao=null;


        try {
            String driveName="com.mysql.jdbc.Driver";
            Class.forName(driveName);


            String serverName="localhost";
            String mydatabase="my_taskmanagment";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String UserName="root";
            String pass="";

           conexao= DriverManager.getConnection(url,UserName,pass);

            if (conexao!=null){
                status="conectado com sucesso";

            }else{
                status="Nao foi Possivel  Conectar a bd";

            }
           
            return conexao;


        } catch (ClassNotFoundException e) {
           // throw new RuntimeException(e);
            System.out.println("drive nao encontrado: "+e);
            return null;

        } catch (SQLException e) {
            System.out.println("nao foi possivel conectar a base de dados");
            return null;
           // throw new RuntimeException(e);
        }

}
    public static String getStatus(){
        return status;
    }
    
    public static boolean fecharConexao(){
        try {
            ConexaoJDBC.getConneection().close();
            return true;
        } catch (SQLException ex) {
            
          //  Logger.getLogger(ConexaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static java.sql.Connection ReiniciarConexao(){
        fecharConexao();
        
       return ConexaoJDBC.getConneection();
    }
    
    
}