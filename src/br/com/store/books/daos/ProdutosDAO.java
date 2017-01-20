package br.com.store.books.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.store.books.models.Book;

public class ProdutosDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("app-jpa-books");
	EntityManager manager = factory.createEntityManager();
	
	public List<Book> listarProdutos(){
		return manager.createQuery("SELECT b FROM Book b",Book.class).getResultList();
	}
}
