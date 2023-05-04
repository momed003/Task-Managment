
package Controler;

import data.ConectionFactory;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
/**
 *  private int id;
    private String titulo;
    private String descricao;
    private String data_entrega;
    private String estado;
    private int user_id;
    private String created_at;
    private String tempo_estimado;
    private String tempo_gasto;
 * @author user
 */
public class ProjectoControler {
    
    Projectos p=new Projectos();
    
    public String cria(){
        try {
            FileWriter fw=new FileWriter("PrpjectoController");
            PrintWriter pw=new PrintWriter(fw);//escreve e pula uma linha no documento
            
            
                pw.println("id:" +p.getId());
                pw.println("titulo: "+p.getTitulo());
                pw.println("Descricao: "+p.getDescricao());
                pw.println("Data de entrega: "+p.getData_entrega());
                pw.println("Estado: "+p.getEstado());
                pw.println("User id: "+p.getUser_id());
                pw.println("data de criacao: "+p.getCreated_at());
                pw.println("Tempo estimado: "+p.getTempo_estimado());
                pw.println("tempo gasto: "+p.getTempo_gasto());
            pw.flush();//mandando os dados para o arquivo txt
            pw.close();//fechando a conexao
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(ProjectoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
