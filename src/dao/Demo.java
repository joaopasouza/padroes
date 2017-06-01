/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author joaopaulo
 */
public class Demo {

    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        dao.insert(new Pessoa(1, "João Paulo"));
        dao.insert(new Pessoa(2, "Patrícia"));

        dao.getAll().stream().forEach((pessoa) -> {
            System.out.println("Pessoa: [id: " + pessoa.getId() + ", Nome: " + pessoa.getNome() + "]");
        });
    }

}
