
public class BookRental extends Transaction {
	
	 public BookRental(Book book, String dateOfRequest, String dateOfServe, User userId){
		  super(book, dateOfRequest,dateOfServe,userId);
		  
	  }
	
	
	public String toString(){
		return "BookRental Transaction with id: "+this.transId+", of book: "+this.book.title+", from user: "+this.userId.getName();
		
	}
}
