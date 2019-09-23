/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.EmissorCreator;
import view.Emissor;

/**
 *
 * @author Raphael Policena
 */
public class TestaEmissores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmissorCreator creator = new EmissorCreator();
        // SMS
        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia(" K19 Treinamentos ");
        // Email
        Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
        emissor2.envia(" K19 Treinamentos ");
        // JMS
        Emissor emissor3 = creator.create(EmissorCreator.JMS);
        emissor3.envia(" K19 Treinamentos ");
    }

}
