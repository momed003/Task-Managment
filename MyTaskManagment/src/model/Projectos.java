
package model;

import java.time.LocalDate;

/**
 *
 * @author momed003
 */
public class Projectos {
     private int id;
    private String titulo;
    private String descricao;
    private LocalDate data_entrega;
    private String estado;
    private int user_id;
    private LocalDate created_at;
    private LocalDate tempo_estimado;
    private LocalDate tempo_gasto;

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

    public LocalDate getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(LocalDate data_entrega) {
        this.data_entrega = data_entrega;
    }

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

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getTempo_estimado() {
        return tempo_estimado;
    }

    public void setTempo_estimado(LocalDate tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
    }

    public LocalDate getTempo_gasto() {
        return tempo_gasto;
    }

    public void setTempo_gasto(LocalDate tempo_gasto) {
        this.tempo_gasto = tempo_gasto;
    }
    

   
    
   
}
