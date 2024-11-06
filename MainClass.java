package project;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    Book b[]=new Book[7];
    System.out.println("**********LibraryManagementSystem***********");
	int index=0;
	b[index++]=new Book("GreenEggs","DrSeuss", 1012, true, "Children");
	b[index++]=new Book("Ham","DrSeuss", 1013, true, "Children");
	b[index++]=new Book("TheHungerGames ","SuzanneCollins", 1022, true, "Young adult");
	b[index++]=new Book("Dune","FrankHerbert", 1032, true, "Science");
	b[index++]=new Book("TheLeftHandofDarkness","UrsalaleGuin", 1042, true, "Science");
	b[index++]=new Book("SwamiVivekanad","Sahitya", 2042, true, "Hindi");
	b[index++]=new Book("SarvshreshthKahaniya","RabindranathTagore", 1042, true, "Science");
	Library l=new Library();	
	Borrower user=new Borrower(b);
	int ch=0;
	do {
		System.out.println("\nChoice1:Display the books \nChoice2:Search the book through genre"
				+ "\nChoice3:User Borrow the book through title \nChoice4:User search the book through author"
				+ "\nChoice5:User return the book through book title");
		System.out.println("Enter the choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1:	l.display(b);break;
		case 2: 
			System.out.println("Enter the genre u want to search");
			l.searchGenre(b, sc.next());break;
		case 3: 
			System.out.println("\nUser borrow the book through title");
			System.out.println("enter the title");
		user.borrowTitle(b,sc.next());break;
		case 4: 
			System.out.println("\nUser search the book through author");
			System.out.println("Enter the author");
			user.searchAuthor(b, sc.next());break;
		case 5:System.out.println("\nUser return the book through title");
		System.out.println("Enter the title of the book");
		user.returnBook(b,sc.next());break;
		default:System.out.println("exit the operation");
		}
	}
	while(ch<=6);

	
	
	
	
	
	

	
}
}
