import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Library{
	String expectedPattern = "dd/MM/yyyy";
    SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);

		private BookList books;
		private AuthorList author;
		private UserList userList=new UserList();
		private TransactionQueue transQ=new  TransactionQueue();
		private TransactionHistory transHist=new  TransactionHistory();

		public Library(BookList books, AuthorList author ){
			this.books=books;
			this.author=author;
		}

		public void printAvailables(){
			for(int i=0;i<books.length();i++){
				books.getBook(i);
                System.out.println(books.getBook(i).getBook().toString());///returns book list node that give a book that execute to string
						

			}
		}

		public void printBookDetails(String title){
            boolean temp=false;
			for(int i=0;i<books.length();i++){
				Book tempBook=books.getBook(i).getBook();
				if (tempBook.title.equalsIgnoreCase(title)){
					System.out.println(tempBook.toString());
					temp=true;
				    }
			}
				if (temp==false) {
					System.out.println("This title is not available");
					
				}
			}


		public void printBookFromAuthor(String author){
            boolean temp=false;
			for(int i=0;i<books.length();i++)
			{Book tempBook=books.getBook(i).getBook();
				if (tempBook.author.getName().equalsIgnoreCase(author)){
					System.out.println(tempBook.toString());
					temp=true;
                 }
			}
				if (temp==false) {
					System.out.println("This Author is not available");
				}
			}
		
		
		 public void returnBook(String title, User user){

			
				for(int i=0;i<books.length();i++)
				{   Book tempBook=books.getBook(i).getBook();
					if (tempBook.title.equalsIgnoreCase(title)){
						tempBook.availableCopies++;
						
						BookReturn tempTrans =new BookReturn (tempBook,"","",user);
						transQ.add(tempTrans);
	                 }
				}
					
				}
		    
		 public void rentBook(String title, User user){
	           
				for(int i=0;i<books.length();i++){
					Book tempBook=books.getBook(i).getBook();
					if (tempBook.title.equalsIgnoreCase(title)){
						//tempBook.availableCopies--;	
						if(tempBook.availableCopies>0){
							tempBook.availableCopies--;	
							tempBook.timesRented++;
							BookRental tempTrans =new BookRental (tempBook,"","",user);
							transQ.add(tempTrans);
						}
						
	                 }
				}
		 }
					
		 public void executePendingTransactions()	{
			 for(int i=this.transQ.size();i>0;i--){
			Transaction tempTrans=transQ.remove();
			
			transHist.add(tempTrans);}
							 
		 }
		 
		 public void printPendingTransactions(){
		    	
			 transQ.printPendingTransactions();
		    }
		 
		 public void printFinishedTransactions(){
		    	
			 transHist.printFinishedTransactions();
		    }
		 
		 public Author getAuthor(String author){

			 return this.author.searchAuthor(author);
		 }
		 
		 public void addNewBookToLibrary(String title, Author author,String isbn,int physicalCopies,int availableCopies,int timesRented){
		    	Book tempBook=new Book(title, author,isbn,physicalCopies,availableCopies,timesRented);
		    	books.add(tempBook);
		    	
		    }	 
		 
		 public void registerUser(String name, String date){
				
			 Date tempDate=null;
			try {
				tempDate = formatter.parse(date);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			    
				userList.addUser(name, tempDate);
			}
		 

			public User searchForUser (String name){
				
				return userList.search(name);
			}
			
			public void printAllUsers(){
				userList.printAll();
				
			}
}
