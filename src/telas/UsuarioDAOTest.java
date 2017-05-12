/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.UsuarioDAO;
import entidade.Usuario;

/**
 *
 * @author Wesley Fernando
 */
public class UsuarioDAOTest {
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usu = usuarioDAO.buscarPorNome("LEONARDO");
        
        
        if (usu == null){
            System.out.println("Usuario e/ou Senha Invalida");
            
        }
        
        else if (!usu.getAtivo()){
            System.out.println("Usuario bloqueado!!!");
            
        }
        else if (!usu.getUsu_senha().equals("12345")){
            System.out.println("Usuario e/ou Senha Invalida");
        }
        else{
            
        }
            
        
    }
    
}
