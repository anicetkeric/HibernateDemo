/**#################################################################
 * 
 **#################################################################*/
package com.demo.hibernate.output;

import java.util.List;

import com.demo.hibernate.dao.BookDao;
import com.demo.hibernate.entity.Book;

/**#################################################################
 * @author ANICET ERIC KOUAME
 * @Date: 20 mars 2017
 * @Description:
 *Main
 *#################################################################*/

public class Main {

	 /**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	 {
	
		BookDao b=new BookDao();
		Book book=new Book();
      
	
		/**#################################################################
		 * Call Add book
		 *#################################################################*/
		b.saveBook("terminator", "Jame", 550);
		
		
		/**#################################################################
		 * Call get list book
		 *#################################################################*/
		List<Book> bt=b.getBooks();
		System.out.println(bt.get(0).getAuthor());
		
		

		/**#################################################################
		 * Update book
		 *#################################################################*/
		book.setAuthor("Anicet");
		book.setTitle("mecanique");
		book.setPrice(600);
		book.setId(1);		
		System.out.println(b.updateBook(book));
		
		
		/**#################################################################
		 * Delete book
		 *#################################################################*/
		System.out.println(b.deleteBook(2));
		
		
	 }
	
	  
}
