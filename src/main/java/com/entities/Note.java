package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="notes")
public class Note {
@Id
private int id;
private String title;
@Column(length = 70000)
private String content;
private Date addedDate;


public Note(int id, String title, String content, Date addedDate) {
	super();
	this.id = new Random().nextInt(100000);
	this.title = title;
	this.content = content;
	this.addedDate = addedDate;
}
public int getId() {
	return id;
}
public String getTitle() {
	return title;
}
public String getContent() {
	return content;
}
public Date getAddedDate() {
	return addedDate;
}
public void setId(int id) {
	this.id = id;
}
public void setTitle(String title) {
	this.title = title;
}
public void setContent(String content) {
	this.content = content;
}
public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}
/**
 * 
 */
public Note() {
	super();
	// TODO Auto-generated constructor stub
}



	

	
	
	
	
	
	
}
