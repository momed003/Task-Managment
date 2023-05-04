/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String estado;
    private String prazo;
    private Utilizador user_id;
    private Projecto project_id;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public Utilizador getUser_id() {
        return user_id;
    }

    public void setUser_id(Utilizador user_id) {
        this.user_id = user_id;
    }

    public Projecto getProject_id() {
        return project_id;
    }

    public void setProject_id(Projecto project_id) {
        this.project_id = project_id;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", estado=" + estado + ", prazo=" + prazo + ", user_id=" + user_id + ", project_id=" + project_id + '}';
    }
    
    
}
