
public class BookReturn extends Transaction {

	
	  public BookReturn (Book book, String dateOfRequest, String dateOfServe, User userId){
		  super(book, dateOfRequest,dateOfServe,userId);
		  
	  }
		public String toString(){
			return "BookReturn Transaction with id: "+this.transId+" ,of book: "+this.book.title+", from user: "+this.userId.getName();
			
		}
	}

