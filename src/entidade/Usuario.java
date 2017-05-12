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

/**
 *
 * @author leona
 */

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer usu_cod;
    
    @Column(length = 30, nullable = false, unique = false)
    private String  usu_nome;
    
    @Column(length = 50, nullable = false)
    private String usu_tipo;
    
    @Column (length = 14, nullable = false)
    private String usu_senha;
    
    @Column(nullable = false)
    private Boolean usu_ativo;

    public String getUsu_tipo() {
        return usu_tipo;
    }

    public void setUsu_tipo(String usu_tipo) {
        this.usu_tipo = usu_tipo;
    }

    public Boolean getUsu_ativo() {
        return usu_ativo;
    }

    public void setUsu_ativo(Boolean usu_ativo) {
        this.usu_ativo = usu_ativo;
    }

    public Boolean getAtivo() {
        return usu_ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.usu_ativo = ativo;
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
