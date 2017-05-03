/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author leona
 */

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer usu_cod;
    
    @Column(length = 30, nullable = false)
    private String  usu_nome;
    
    @Column(length = 50, nullable = false)
    private String usu_tipo_usuario;

    @Column (length = 14, nullable = false)
    private String usu_senha;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Aluno usu_aluno;
    
    public String getUsu_tipo_usuario() {
        return usu_tipo_usuario;
    }

    public void setUsu_tipo_usuario(String usu_tipo_usuario) {
        this.usu_tipo_usuario = usu_tipo_usuario;
    }

    public Aluno getUsu_aluno() {
        return usu_aluno;
    }

    public void setUsu_aluno(Aluno usu_aluno) {
        this.usu_aluno = usu_aluno;
    }
    
    public Integer getUsu_cod() {
        return usu_cod;
    }

    public void setUsu_cod(Integer usu_cod) {
        this.usu_cod = usu_cod;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

       
    
}
