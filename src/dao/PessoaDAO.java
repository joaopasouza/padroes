/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author joaopaulo
 */
public class PessoaDAO implements IDAO<Pessoa> {

    private final ArrayList<Pessoa> pessoas;

    public PessoaDAO() {
        pessoas = new ArrayList<>();
    }

    @Override
    public ArrayList<Pessoa> getAll() {
        return pessoas;
    }

    @Override
    public Pessoa getById(int id) {
        int index = pessoas.indexOf(id);
        return pessoas.get(index);
    }

    @Override
    public void insert(Pessoa entity) {
        pessoas.add(entity);
    }

    @Override
    public void update(Pessoa entity) {
        int index = pessoas.indexOf(entity.getId());
        pessoas.get(index).setNome(entity.getNome());
    }

    @Override
    public boolean delete(Pessoa entity) {
        return pessoas.remove(entity);
    }

}
