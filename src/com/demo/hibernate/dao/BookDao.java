/**#################################################################
 * 
 **#################################################################*/
package com.demo.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import com.demo.hibernate.entity.Book;
import com.demo.hibernate.utility.HibernateUtil;

/**#################################################################
 * @author ANICET ERIC KOUAME
 * @Date: 20 mars 2017
 * @Description:
 *BookDao
 *#################################################################*/

public class BookDao {

	
	public void saveBook(String title,String author,double price){
        Session session = HibernateUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Book book=new Book();
      	  book.setTitle(title);
    	  book.setAuthor(author);
    	  book.setPrice(price);
            
            session.save(book);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	
    public List<Book> getBooks(){
    	Session session = HibernateUtil.getSession(); 
        Query query = session.createQuery("from Book");
        List<Book> books =  query.list();
        session.close();
        return books;
    }
	
    
    public int updateBook(Book b){
        if(b.getId() <=0)  
              return 0;  
        	Session session = HibernateUtil.getSession(); 
           Transaction tx = session.beginTransaction();
           String hql = "update Book set title = :title, author=:author,price=:price where id = :id";
           Query query = session.createQuery(hql);
           query.setInteger("id",b.getId());
           query.setString("title",b.getTitle());
           query.setString("author",b.getAuthor());
           query.setDouble("price",b.getPrice());
           int rowCount = query.executeUpdate();
           
           System.out.println("Rows affected: " + rowCount);
           tx.commit();
           session.close();
           return rowCount;
   }
    
    public int deleteBook(int id) {
    	Session session = HibernateUtil.getSession(); 
        Transaction tx = session.beginTransaction();
        String hql = "delete from Book where id = :id";
        Query query = session.createQuery(hql);
        query.setInteger("id",id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }
	
}
