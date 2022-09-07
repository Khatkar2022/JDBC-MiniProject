package com.cogent.miniproject;

public class Library {
	 int id;
	String name;
	String author;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Library(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void name(String string) {
		// TODO Auto-generated method stub
		
	}
	public void id(int i) {
		// TODO Auto-generated method stub
		
	}
	public void author(String string) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
