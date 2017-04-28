/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Aluno;
import entidades.Pagamento;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Wesley Fernando
 */
public class PagamentoDAO {
    
    public void inserir(Pagamento pagamento){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.save(pagamento);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public void delete(Pagamento pagamento){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.delete(pagamento);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public void editar(Pagamento pagamento){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.update(pagamento);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public List<Pagamento> buscarTudo() {
        Session sessao =
                HibernateUtil.getSessionFactory().openSession();
        

        Criteria criterio = sessao.createCriteria(Pagamento.class);
        
        List<Pagamento> pagamentos = criterio.list();
        
        sessao.close();
        
        return pagamentos;
    }    
     
    
}
