/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.store.books.daos;

import br.com.store.books.models.Book;
import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author paulo
 */
public class BookDAO implements  Serializable{
    

    public void save(Book book){
       
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("app-jpa-books");
    EntityManager manager = factory.createEntityManager();
    
        manager.getTransaction().begin();
        manager.persist(book);
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
    }
}
