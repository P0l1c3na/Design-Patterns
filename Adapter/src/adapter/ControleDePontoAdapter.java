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
public class ControleDePontoAdapter extends ControleDePonto {

    private ControleDePontoNovo controleDePontoNovo;

    public ControleDePontoAdapter() {
        this.controleDePontoNovo = new ControleDePontoNovo();
    }

    public void registraEntrada(Funcionario f) {
        this.controleDePontoNovo.registra(f, true);
    }

    public void registraSaida(Funcionario f) {
        this.controleDePontoNovo.registra(f, false);
    }
}
