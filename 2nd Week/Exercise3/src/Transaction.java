import java.util.Date;

public class Transaction {
	
	public static int counter;

	public Book book;
	private String dateOfRequest;
	private String dateOfServe;
	public User userId;
	public int transId;
	
	public Transaction(Book book, String dateOfRequest, String dateOfServe, User userId){
		counter++;
		this.transId=counter;
		this.userId=userId;
		this.dateOfRequest=dateOfRequest;
		this.book=book;
		setServedDate(dateOfServe);		
		
	}
	
//	public Transaction(){
//		counter++;
//			
//		
//	}
	
	public void setServedDate(String dateOfServe){
		
		this.dateOfServe=dateOfServe;
	}
}
