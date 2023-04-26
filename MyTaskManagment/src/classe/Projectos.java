
package classe;

import java.io.DataInputStream;

/**
 * id int unsigned not null auto_increment,
		titulo varchar (60) not null,
		descricao varchar (500) not null,
        estado varchar(15) not null,
        userId int unsigned not null,
        dataCriacao datetime,
        dataEntrega datetime,
        tempoNecessario time,
        tempoGasto time,
        primary key(id)
 * @author user
 */
public class Projectos {
    private int id;
    private String titulo;
    private String descricao;
    private boolean  estado;
    private DataInputStream dataCriacao;
    private DataInputStream dataEntrega;
    private String    tempoNecessario ;
    private String   tempeGasto ;
}
