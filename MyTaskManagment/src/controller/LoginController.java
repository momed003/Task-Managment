/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import data.ConexaoJDBC;
import jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class LoginController {
    private Connection con;
    
    public LoginController() {
        this.con = new ConexaoJDBC().getConnection();
    }
    
    
   public void efetuarLogin(String email, String senha) {
        try{
            String sql = "select*from users where email = ? and senha =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema");
            } else {
                 JOptionPane.showMessageDialog(null, "Dados fornecido estão incorretos, tente novamente !");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu erro ao entrar " + e);
        }
    }   
}
