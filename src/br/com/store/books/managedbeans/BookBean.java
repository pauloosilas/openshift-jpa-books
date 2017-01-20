/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.store.books.managedbeans;

import br.com.store.books.models.Book;
import br.com.store.books.daos.BookDAO;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author paulo
 */
@ManagedBean
public class BookBean implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Book book;
    private BookDAO bookDAO;
    
    public BookBean(){
        book = new Book();
      
    }
    
    @PostConstruct
    public void init(){
    	  book = new Book();
    }
    
    public void save(Book book){
       System.out.println(book);
        
       bookDAO = new BookDAO();
       
       bookDAO.save(book);
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }
    
}
