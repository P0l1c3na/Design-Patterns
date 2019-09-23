/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Configuracao;

/**
 *
 * @author Raphael Policena
 */
public class TestaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Configuracao configuracao = Configuracao.getInstance();
        System.out.println(configuracao.getPropriedade(" time-zone "));
        System.out.println(configuracao.getPropriedade(" currency-code "));
        System.out.println(configuracao.toString());

        Configuracao configuracao2 = Configuracao.getInstance();

        System.out.println(configuracao2.toString());

        Configuracao configuracao3 = Configuracao.getInstance();

        System.out.println(configuracao3.toString());
    }

}
