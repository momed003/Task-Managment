
package model;

import java.time.Period;
import java.util.Calendar;
import javax.swing.JOptionPane;





public class Datas {
    Projectos p=new Projectos();
        Calendar calendario=Calendar.getInstance();
        
        public Calendar dataCriacao(){//retornar a data em que o projecto for criado
            return calendario;
            
        }
        public Period tempoEstimado(){
        
            if (p.getCreated_at()!=null && p.getData_entrega()!=null) {
             Period per=Period.between(p.getCreated_at(), p.getData_entrega());
             return per;
            }else{
                JOptionPane.showMessageDialog(null, "Erro: Datas vazias");
            }
                return Period.ZERO;
        }
        
        
        public static void main(String[] args) {
            Datas date=new Datas();
            System.out.println(date.tempoEstimado());
    }
}
