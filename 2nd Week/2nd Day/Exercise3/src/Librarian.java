import java.text.ParseException;
import java.util.Date;

public class Librarian{

	   private Library library;


      public Librarian (Library library){

		  this.library=library;

	  }
      
      public Author getAuthor(String author){

  		return library.getAuthor(author);
  		}

	   public void findMeBooksFromAuthor(String author){

		library.printBookFromAuthor(author);
		}


		public void findMeAvailableBooks(){

		library.printAvailables();
		}

	    public void findMeBook(String title){

	    library.printBookDetails(title);
		}
	    
	    public void returnBook(String title,String user){
            User tempUser=this.searchForUser(user);
	    	if(tempUser!=null)
		    library.returnBook(title,tempUser);
			}
	    
	    public void rentBook(String title,String user){

	    	 User tempUser=this.searchForUser(user);
		    	if(tempUser!=null)
			    library.rentBook(title,tempUser);
				}
			
	    
	    public void addNewBookToLibrary(String title, Author author,String isbn,int physicalCopies,int availableCopies,int timesRented){
	    	library.addNewBookToLibrary(title, author,isbn,physicalCopies,availableCopies,timesRented);
	    	
	    }
	    
	    public void executePendingTransactions(){
	    	
	    	
	    	library.executePendingTransactions();
	    }
	    
	    public void printFinishedTransactions(){
	    	
	    	library.printFinishedTransactions();
	    }
	    
	    
	    public void printPendingTransactions(){
	    	
	    	library.printPendingTransactions();
	    }

	    
	    public void registerUser(String name, String date){
			
			library.registerUser(name, date);
			}
		 

			public User searchForUser (String name){
				
				return library.searchForUser(name);
			}
			
			public void printAllUsers(){
				library.printAllUsers();
				
			}
	}