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
 * @param <T>
 */
public interface IDAO<T> {

    public ArrayList<T> getAll();

    public T getById(int id);

    public void insert(T entity);

    public void update(T entity);

    public boolean delete(T entity);

}
