package com.cogent.miniproject;

public class Tester {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BusinessLogic bLogic= new BusinessLogic(); 
			try {
				 //bLogic.addBooks();
				 //bLogic.displayBooks();
				 //bLogic.deleteBook();
			}catch(Throwable e){
		e.printStackTrace();
			}
	}		
}