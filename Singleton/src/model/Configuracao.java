/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Raphael Policena
 */
public class Configuracao {

    private Map< String, String> propriedades;
    private static Configuracao instance;

    private Configuracao() {
        this.propriedades = new HashMap< String, String>();
        this.propriedades.put(" time-zone ", " America/Sao_Paulo ");
        this.propriedades.put(" currency-code ", " BRL ");
    }

    public static Configuracao getInstance() {
        if (Configuracao.instance == null) {
            Configuracao.instance = new Configuracao();
        }
        return Configuracao.instance;
    }

    public String getPropriedade(String nomeDaPropriedade) {
        return this.propriedades.get(nomeDaPropriedade);
    }
}
