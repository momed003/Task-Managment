/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import data.ConexaoJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Projecto;

/**
 *
 * @author LENOVO
 */
public class ProjectoController {
    private final Connection con;
    
    public ProjectoController() {
        con = new ConexaoJDBC().getConnection();
    }
    
    public void criarProjecto(Projecto projecto){
            try {
                
            // verificar se um user ja existe
            String sqlExist = "select*from users where id = ?  limit 1";

            PreparedStatement stmtExist = con.prepareStatement(sqlExist);
            stmtExist.setInt(1, projecto.getId());

            ResultSet cadastroExist = stmtExist.executeQuery();
            if(!cadastroExist.next()){
                // user nao existe
               JOptionPane.showMessageDialog(null, "Utilizador nao existe na base de dados" );
            }else{
                // user existe => criar o projecto
            }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "erro" );
            }
    }
}
