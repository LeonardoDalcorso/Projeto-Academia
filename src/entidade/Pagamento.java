/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Date;
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
public class Pagamento {
    
    @Id
    @GeneratedValue    
    private int pag_cod;
    
    @Column (nullable = false)
    private Date pag_dat_inicio;
    
    @Column (nullable = false)
    private Date pag_dat_vencimento;
    
    @Column (nullable = false)
    private Date pag_dat_pagamento;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Aluno pag_aluno;

    public int getPag_cod() {
        return pag_cod;
    }

    public void setPag_cod(int pag_cod) {
        this.pag_cod = pag_cod;
    }

    public Date getPag_dat_inicio() {
        return pag_dat_inicio;
    }

    public void setPag_dat_inicio(Date pag_dat_inicio) {
        this.pag_dat_inicio = pag_dat_inicio;
    }

    public Date getPag_dat_vencimento() {
        return pag_dat_vencimento;
    }

    public void setPag_dat_vencimento(Date pag_dat_vencimento) {
        this.pag_dat_vencimento = pag_dat_vencimento;
    }

    public Date getPag_dat_pagamento() {
        return pag_dat_pagamento;
    }

    public void setPag_dat_pagamento(Date pag_dat_pagamento) {
        this.pag_dat_pagamento = pag_dat_pagamento;
    }

    public Aluno getPag_aluno() {
        return pag_aluno;
    }

    public void setPag_aluno(Aluno pag_aluno) {
        this.pag_aluno = pag_aluno;
    }
    
    
    
    
}
