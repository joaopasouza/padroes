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
public class TratadorTXT implements ITratador {

    @Override
    public boolean aceitar(String extensao) {
        return extensao.equals(".txt");
    }

    @Override
    public void tratar(String extensao) throws Exception {
        System.out.println("Trantando arquivos com extensão: " + extensao);
    }

}
