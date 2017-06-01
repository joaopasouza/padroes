/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import java.util.ArrayList;

/**
 *
 * @author joaopaulo
 */
public class Processador {

    private final ArrayList<ITratador> tratadores;

    public Processador() {
        tratadores = new ArrayList<>();
    }

    public void add(ITratador tratador) {
        tratadores.add(tratador);
    }

    public void processar(String extensao) throws Exception {
        for (ITratador t : tratadores) {
            if (t.aceitar(extensao)) {
                t.tratar(extensao);
                break;
            } else {
                throw new Exception("Tratador não encontrado.");
            }
        }
    }

}
