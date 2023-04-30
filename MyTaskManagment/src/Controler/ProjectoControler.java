
package Controler;

import data.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Projectos;


/**
 *
 * @author momed003
 * 
 */
public class ProjectoControler {
    
    public void creat(Projectos p) throws SQLException{
        //abrindo a conexao
        Connection com=ConectionFactory.getConnection();
        //preparando a conexao
        PreparedStatement ps=null;//serve para preparar e executar a classe
        
        try {
            ps=com.prepareStatement("INSERT INTO projects (id,titulo,descricao,data_entrega,estado,user_id,created_at,tempo_estimado,tempo_gasto,)"
            +"VALUES (?,?,?,?,?,?,?,?,?)");
        ps.setInt(0, p.getId());
        ps.setString(1, p.getTitulo());
        ps.setString(2, p.getDescricao());
        ps.setString(3, p.getData_entrega());
        ps.setString(4, p.getEstado());
        ps.setInt(5,p.getUser_id());
        ps.setString(6, p.getCreated_at());
        ps.setString(7, p.getTempo_estimado());
        ps.setString(8, p.getTempo_gasto());
        
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
         //   Logger.getLogger(ProjectoControler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConectionFactory.closeConection(com, ps);
        }
        
    }
    
}
