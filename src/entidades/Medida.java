/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
public class Medida {
    
    @Id
    @GeneratedValue
    private int med_cod;
    
    @Column(nullable = false)
    private Date med_dataMendida; //****
    
    @Column (nullable = false)
    private Date med_dataProxMedida; //****
    
    @Column(length = 3, nullable = false)
    private double med_peso;
    
    @Column(length = 3, nullable = false)
    private double med_altura;
    
    @Column(length = 3, nullable = false)
    private double med_pescoco;
     
    @Column(length = 3, nullable = false)
    private double med_ombro;
     
    @Column(length = 3, nullable = false)
    private double med_torax;
     
    @Column(length = 3, nullable = false)
    private double med_bicepsDireito;
    
    @Column(length = 3, nullable = false)
    private double med_bicepsEsquerdo;
     
    @Column(length = 3, nullable = false)
    private double med_antiBracoDireito;
     
    @Column(length = 3, nullable = false)
    private double med_antiBracoEsquerdo;
     
    @Column(length = 3, nullable = false)
    private double med_cintura;
     
    @Column(length = 3, nullable = false)
    private double med_adbomen;
     
    @Column(length = 3, nullable = false)
    private double med_quadril;
     
    @Column(length = 3, nullable = false)
    private double med_coxaDireita;
     
    @Column(length = 3, nullable = false)
    private double med_coxaEsquerda;
     
    @Column(length = 3, nullable = false)
    private double med_panturilhaEsquerda;
     
    @Column(length = 3, nullable = false)
    private double med_panturilhaDireita;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Aluno med_aluno;

    
    public Aluno getMed_aluno() {
        return med_aluno;
    }

    public void setMed_aluno(Aluno med_aluno) {
        this.med_aluno = med_aluno;
    }
    
    
    public int getMed_cod() {
        return med_cod;
    }

    public void setMed_cod(int med_cod) {
        this.med_cod = med_cod;
    }

    public Date getMed_dataMendida() {
        return med_dataMendida;
    }

    public void setMed_dataMendida(Date med_dataMendida) {
        this.med_dataMendida = med_dataMendida;
    }

    public Date getMed_dataProxMedida() {
        return med_dataProxMedida;
    }

    public void setMed_dataProxMedida(Date med_dataProxMedida) {
        this.med_dataProxMedida = med_dataProxMedida;
    }

    public double getMed_peso() {
        return med_peso;
    }

    public void setMed_peso(double med_peso) {
        this.med_peso = med_peso;
    }

    public double getMed_altura() {
        return med_altura;
    }

    public void setMed_altura(double med_altura) {
        this.med_altura = med_altura;
    }

    public double getMed_pescoco() {
        return med_pescoco;
    }

    public void setMed_pescoco(double med_pescoco) {
        this.med_pescoco = med_pescoco;
    }

    public double getMed_ombro() {
        return med_ombro;
    }

    public void setMed_ombro(double med_ombro) {
        this.med_ombro = med_ombro;
    }

    public double getMed_torax() {
        return med_torax;
    }

    public void setMed_torax(double med_torax) {
        this.med_torax = med_torax;
    }

    public double getMed_bicepsDireito() {
        return med_bicepsDireito;
    }

    public void setMed_bicepsDireito(double med_bicepsDireito) {
        this.med_bicepsDireito = med_bicepsDireito;
    }

    public double getMed_bicepsEsquerdo() {
        return med_bicepsEsquerdo;
    }

    public void setMed_bicepsEsquerdo(double med_bicepsEsquerdo) {
        this.med_bicepsEsquerdo = med_bicepsEsquerdo;
    }

    public double getMed_antiBracoDireito() {
        return med_antiBracoDireito;
    }

    public void setMed_antiBracoDireito(double med_antiBracoDireito) {
        this.med_antiBracoDireito = med_antiBracoDireito;
    }

    public double getMed_antiBracoEsquerdo() {
        return med_antiBracoEsquerdo;
    }

    public void setMed_antiBracoEsquerdo(double med_antiBracoEsquerdo) {
        this.med_antiBracoEsquerdo = med_antiBracoEsquerdo;
    }

    public double getMed_cintura() {
        return med_cintura;
    }

    public void setMed_cintura(double med_cintura) {
        this.med_cintura = med_cintura;
    }

    public double getMed_adbomen() {
        return med_adbomen;
    }

    public void setMed_adbomen(double med_adbomen) {
        this.med_adbomen = med_adbomen;
    }

    public double getMed_quadril() {
        return med_quadril;
    }

    public void setMed_quadril(double med_quadril) {
        this.med_quadril = med_quadril;
    }

    public double getMed_coxaDireita() {
        return med_coxaDireita;
    }

    public void setMed_coxaDireita(double med_coxaDireita) {
        this.med_coxaDireita = med_coxaDireita;
    }

    public double getMed_coxaEsquerda() {
        return med_coxaEsquerda;
    }

    public void setMed_coxaEsquerda(double med_coxaEsquerda) {
        this.med_coxaEsquerda = med_coxaEsquerda;
    }

    public double getMed_panturilhaEsquerda() {
        return med_panturilhaEsquerda;
    }

    public void setMed_panturilhaEsquerda(double med_panturilhaEsquerda) {
        this.med_panturilhaEsquerda = med_panturilhaEsquerda;
    }

    public double getMed_panturilhaDireita() {
        return med_panturilhaDireita;
    }

    public void setMed_panturilhaDireita(double med_panturilhaDireita) {
        this.med_panturilhaDireita = med_panturilhaDireita;
    }

  
}
