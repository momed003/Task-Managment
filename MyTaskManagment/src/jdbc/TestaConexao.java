/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class TestaConexao {
        public  static void main(String[] args){
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexao: " + e);
            
        }
    }  
}
