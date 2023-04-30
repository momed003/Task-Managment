
package model;

/**
 *
 * @author momed003
 */
public class Projectos {
     private int id;
    private String titulo;
    private String descricao;
    private String data_entrega;
    private String estado;
    private int user_id;
    private String created_at;
    private String tempo_estimado;
    private String tempo_gasto;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTempo_estimado() {
        return tempo_estimado;
    }

    public void setTempo_estimado(String tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
    }

    public String getTempo_gasto() {
        return tempo_gasto;
    }

    public void setTempo_gasto(String tempo_gasto) {
        this.tempo_gasto = tempo_gasto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }
   
}
