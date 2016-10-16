public class Librarian{

	   private Library library;


      public Librarian (Library library){

		  this.library=library;

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

	}