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
public class Aluno {
    
        
    @Id
    @GeneratedValue
    private Integer alu_cod; 
    
    @Column(length = 40,nullable = false)
    private String alu_nome;
    
    @Column(length = 14, nullable = false, unique = false)
    private String alu_cpf;
    
    @Column(length = 14, nullable = false, unique = false)
    private String alu_rg;
    
    @Column(length = 8)
    private String alu_data_nascimento;
    
    @Column (length = 15, nullable = false)
    private String alu_sexo;
    
    @Column (length = 8, unique = true) //Data do inicio do pagamento 
    private String alu_data_inicioPagamento;
    
    @Column (length = 30)
    private String alu_endereco;
    
    @Column (length = 30)
    private String alu_bairro;
    
    @Column (length = 30)
    private int alu_numero;
    
    @Column (length = 30)
    private int alu_cep;
    

    public Integer getAlu_cod() {
        return alu_cod;
    }

    public void setAlu_cod(Integer alu_cod) {
        this.alu_cod = alu_cod;
    }

    public String getAlu_nome() {
        return alu_nome;
    }

    public void setAlu_nome(String alu_nome) {
        this.alu_nome = alu_nome;
    }

    public String getAlu_cpf() {
        return alu_cpf;
    }

    public void setAlu_cpf(String alu_cpf) {
        this.alu_cpf = alu_cpf;
    }

    public String getAlu_rg() {
        return alu_rg;
    }

    public void setAlu_rg(String alu_rg) {
        this.alu_rg = alu_rg;
    }

    public String getAlu_data_nascimento() {
        return alu_data_nascimento;
    }

    public void setAlu_data_nascimento(String alu_data_nascimento) {
        this.alu_data_nascimento = alu_data_nascimento;
    }

    public String getAlu_sexo() {
        return alu_sexo;
    }

    public void setAlu_sexo(String alu_sexo) {
        this.alu_sexo = alu_sexo;
    }

    public String getAlu_data_inicioPagamento() {
        return alu_data_inicioPagamento;
    }

    public void setAlu_data_inicioPagamento(String alu_data_inicioPagamento) {
        this.alu_data_inicioPagamento = alu_data_inicioPagamento;
    }

   
  
}
