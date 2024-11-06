package project;

public class Borrower {
	Book b[];
	public Borrower(Book b[]) {
		this.b=b;
	}
 Library l=new Library();
 void borrowTitle(Book b[],String title) {
	 System.out.println("*********Search the book*******");
	l.searchTitle(b,title);
	
	
 }
 public void searchAuthor(Book[] books, String author) {
     System.out.println("********* Search Author's Books *********");
     l.searchUser(books, author);
 }
 void returnBook(Book b[],String title) {
	 System.out.println("********* Return The Book *********");
	 l.returnTitle(b, title);
 }
}
