/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.Emissor;

/**
 *
 * @author Raphael Policena
 */
public class EmissorJms implements Emissor{

    @Override
    public void envia(String message) {
            System.out.println ( " Enviando por JMS a mensagem : " ) ;
            System.out.println ( message ) ;
    }
    
}
