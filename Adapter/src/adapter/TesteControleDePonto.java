/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Raphael Policena
 */
public class TesteControleDePonto {

    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        Funcionario funcionario = new Funcionario(" Marcelo Martins ");
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registraSaida(funcionario);
    }
}
