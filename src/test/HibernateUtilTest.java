/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author leona
 */
public class HibernateUtilTest {
    
    public static void main(String[] args) {
        //Captura a fabrica de sessoes 
        //Gera uma nova sessao
        //Captura a sessao gerada
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        

        //Troca de Infomaçoes 
         sessao.close();
    }
    
}
