/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author leona
 */
public class HibernateUtil {

        //Fabrica de Sessoes
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            //Cria a fabrica de sessoes apartir das configuraçoes feitas  no arquivo hibernate.cfg.xml
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
                //Exibe erro no console
            // Log the exception. 
            System.err.println("Erro ao tentar criar a fabrica de sessoes." + ex);
            throw new ExceptionInInitializerError(ex);  
            //Abora a sessao
        }
    }
    
    //Metodo leitor fabrica de sessao
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
