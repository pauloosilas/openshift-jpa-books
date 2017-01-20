package br.com.store.books.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.store.books.daos.ProdutosDAO;
import br.com.store.books.models.Book;

@ManagedBean
public class ProdutosBean implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private List<Book> produtos;
		private ProdutosDAO produtoDAO = new ProdutosDAO();
		
		public ProdutosBean(){

		}

		
		@PostConstruct
		public void init(){
			produtos = new ArrayList<>();
			
			produtos = produtoDAO.listarProdutos();

		}
		
		public List<Book> getProdutos() {
			return produtos;
		}

		public void setProdutos(List<Book> produtos) {
			this.produtos = produtos;
		}
		
		
		
}
