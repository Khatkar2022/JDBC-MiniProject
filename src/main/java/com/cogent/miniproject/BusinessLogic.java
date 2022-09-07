package com.cogent.miniproject;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessLogic {

	public Connection cn;
	public Statement st ;
	static public boolean addBooks() throws Throwable {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//jdbc:mysql://localhost:3306/Library
		String URL = "jdbc:mysql://localhost:3306/Library";
		String username = "root";	
		String password = "Sohal@95";
		
		Connection cn = DriverManager.getConnection(URL, username, password);
		System.out.println("Connection Created: "+ cn);

		System.out.println(cn);
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Book id :");
		String id = scr.next();
		System.out.println("Enter Book name :");
		String name = scr.next();
		System.out.println("Enter Author name :");
		String author = scr.next();
		

		
		List<String> BookInfo =  new ArrayList<String>();
		BookInfo.add(id);
		BookInfo.add(name);
		BookInfo.add(author);

			System.out.println(BookInfo);
			
			String sqlQuery = "insert into Library values(?,?,?)";
			
			PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
				pstmt.setString(1, id);
				pstmt.setString(2,name);
				pstmt.setString(3, author);
			pstmt.executeUpdate();
			
		
		return true;
		
		
	} 

	
public void displayBooks() throws Exception{
		
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					//jdbc:mysql://localhost:3306/library
					String URL = "jdbc:mysql://localhost:3306/Library";
					String username = "root";	
					String password = "root";
					
					Connection cn = DriverManager.getConnection(URL, username, password);
					Statement stmt = (Statement) cn.createStatement();
					System.out.println("Connection Created: "+ cn);
						
								String qry1 = "select * from Library";
								ResultSet rs =((java.sql.Statement) stmt).executeQuery(qry1);
								while (rs.next()) {
									System.out.println(rs.getString(1)+"--"+rs.getString(2)+ "--" + rs.getString(3));
								}
									
	}
public void deleteBook() throws Exception{
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					//jdbc:mysql://localhost:3306/industry
					String URL = "jdbc:mysql://localhost:3306/University";
					String username = "root";	
					String password = "root";
					
					Connection cn = DriverManager.getConnection(URL, username, password);
					System.out.println("Connection Created: "+ cn);
							
								System.out.println(cn);
								Scanner scr = new Scanner(System.in);
								
								System.out.println("Enter Book id :");
								String id = scr.next();
								
						String DeleteQuery = "Delete from Library where id = ?";
						PreparedStatement pstmt = cn.prepareStatement(DeleteQuery);
						pstmt.setString(1, id);
						pstmt.executeUpdate();

	
}


}
 
 
 