/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Aluno;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Wesley Fernando
 */
public class AlunoDAO {
    
    public void inserir(Aluno alunos){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.save(alunos);
        
        transacao.commit();
        
        sessao.close();
    }
    
    public void deletar(Aluno alunos){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.delete(alunos);
        
        transacao.commit();
        
        sessao.close();
    }
    
    public void editar(Aluno alunos){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.update(alunos);
        
        transacao.commit();
        
        sessao.close();
    }
    
    public List<Aluno> buscarTudo() {
        Session sessao =
                HibernateUtil.getSessionFactory().openSession();
        

        Criteria criterio = sessao.createCriteria(Aluno.class);
        
        List<Aluno> alunos = criterio.list();
        
        sessao.close();
        
        return alunos;
    }
    
    public List<Aluno> buscarPorCpf(String alu_cpf) {
        Session sessao =
                HibernateUtil.getSessionFactory().openSession();        
        
        Criteria criterio = 
            sessao.createCriteria(Aluno.class);        
        
        criterio.add(Restrictions.like("alu_cpf", "%" + alu_cpf + "%"));        
        
        criterio.addOrder(Order.asc("alu_cpf"));
        
        List<Aluno> alunos = criterio.list();
        
        sessao.close();
        
        return alunos;
    }
    
    public Aluno buscarPorCodigo(int numAluno) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        Aluno aluno =  (Aluno) sessao.get(Aluno.class, numAluno);

        sessao.close();

        return aluno;
    }
}
