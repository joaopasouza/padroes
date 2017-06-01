/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author joaopaulo
 */
public class Demo {

    public static void main(String[] args) {
        String extensao = ".txt";

        Processador processador = new Processador();
        processador.add(new TratadorTXT());

        try {
            processador.processar(extensao);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
