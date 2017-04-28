/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Aluno;
import entidade.Medida;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Wesley Fernando
 */
public class MedidaDAO {
    
    public void inserir(Medida medidas){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.save(medidas);
        
        transacao.commit();
        
        sessao.close();
    }
    
    public void deletar(Medida medidas){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.delete(medidas);
        
        transacao.commit();
        
        sessao.close();
    }
    
    public void editar(Medida medidas){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.delete(medidas);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public List<Medida> buscarTudo() {
        Session sessao =
                HibernateUtil.getSessionFactory().openSession();
        

        Criteria criterio = sessao.createCriteria(Medida.class);
        
        List<Medida> medidas = criterio.list();
        
        sessao.close();
        
        return medidas;
    }          
    
}
