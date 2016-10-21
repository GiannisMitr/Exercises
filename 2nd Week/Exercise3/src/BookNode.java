
public class BookNode {

	private BookNode next;
	private Book book;
	
	public BookNode(Book book){
		this.next=null;
		this.setBook(book);
	}
	
	public void setNext(BookNode bookNode){
		this.next=bookNode;		
	}
	
	public BookNode getNext(){
		return this.next;		
	}
	
	public Book getBook(){
		return this.book;		
	}
	
	public void setBook(Book book){
		this.book=book;		
	}
	
}
