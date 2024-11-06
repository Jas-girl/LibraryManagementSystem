package project;

import java.util.Scanner;

public class Library {
	Book b[];

	Library() {

	}

	Library(Book b[]) {
		this.b = b;

	}

	Scanner sc = new Scanner(System.in);

	void display(Book b[]) {
		System.out.println("********Books are displayed*******");
		for (Book book : b) {
			System.out.println(book.toString());
		}
	}

	public void searchTitle(Book b[], String title) {
		boolean found = false;
		for (int i = 0; i < b.length; i++) {
			if (b[i].getTitle().equalsIgnoreCase(title)) {
				found = true;
				b[i].setAvailable(false);
				System.out.println(b[i].toString());
				

			}

		}

		System.out.println(found == true ? "book is found" : "book is not found");
	}

	public void searchUser(Book b[], String author) {
		for (int i = 0; i < b.length; i++) {
	
		if (b[i].getAuthor().equalsIgnoreCase(author)) {
				System.out.println(b[i].toString());
		}
		}
	}
	public void searchGenre(Book b[], String genre) {
		System.out.println("*********Search through genre*********");
		for (int i = 0; i < b.length; i++) {
	
		if (b[i].getGenre().equalsIgnoreCase(genre)) {
				System.out.println(b[i].toString());
		}
		}
	}
	public void returnTitle(Book b[], String title) {
		boolean found = false;
		for (int i = 0; i < b.length; i++) {
          if(b[i].getTitle().equalsIgnoreCase(title) && b[i].isAvailable()==false) {
        	  found=true;
        	  b[i].setAvailable(true);
        	  System.out.println(b[i].toString());
        	 
        	  
          }
			

		}
		
		System.out.println(found == true ? "book is found" : "book is not found");
	}
}
