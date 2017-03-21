/**
 * 
 */
package com.demo.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**##########################################################
 * @author ANICET ERIC KOUAME
 * @Date 17 févr. 2017 08:53:12
 * @Description: 
 * @Book
 *#################################################################*/
@Entity
@Table(name="BOOK")
public class Book implements Serializable {

	
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	
	private String author;
	private double price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	
	
	
}
