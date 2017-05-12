/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Wesley Fernando
 */
public class UsuarioDAO {
    
    public void inserir(Usuario usuario){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.save(usuario);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public void delete(Usuario usuario){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.delete(usuario);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public void editar(Usuario usuario){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transacao = sessao.beginTransaction();
        
        sessao.update(usuario);
        
        transacao.commit();
        
        sessao.close();
        
    }
    
    public List<Usuario> buscarTudo() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        

        Criteria criterio = sessao.createCriteria(Usuario.class);
        
        List<Usuario> usuarios = criterio.list();
        
        sessao.close();
        
        return usuarios;
    }    
    //Buscar por nome, controle de acesso
    public Usuario buscarPorNome(String usu_nome){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Criteria criterio = sessao.createCriteria(Usuario.class);        
        
        criterio.add(Restrictions.eq("usu_nome", usu_nome));
        
        //Busca apenas um nome
        Usuario usuario = (Usuario) criterio.uniqueResult();
        
        return usuario;
    }
    
    public Usuario buscarPorSenha(String usu_senha){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Criteria criterio = sessao.createCriteria(Usuario.class);        
        
        criterio.add(Restrictions.eq("usu_senha", usu_senha));
        
        //Busca apenas uma senha
        Usuario usuario = (Usuario) criterio.uniqueResult();
        
        return usuario;
    }
    
}
