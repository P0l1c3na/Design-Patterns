/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Raphael Policena
 */
public class ControleDePonto {

    public void registraEntrada(Funcionario f) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "dd/MM/yyyy H:m:s");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(" Entrada : " + f.getNome() + " às " + format);
    }

    public void registraSaida(Funcionario f) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "dd/MM/yyyy H:m:s");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(" Saída : " + f.getNome() + " às " + format);
    }
}
