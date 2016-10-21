

public class BookList {

	private BookNode first;
	
	public BookList(){
		
		this.first=null;
		
	}
	
		public BookList(Book[] books){
				this();
				for(int i=0;i<books.length;i++){
					 add(books[i]);
					  
				   }
				
			}
	
	public void add(Book book){
		
		if (first==null){
			this.first=new BookNode(book);			
		}
		else{
			BookNode current=this.first;
			while(current.getNext()!=null){
				current=current.getNext();				
				
			}
			current.setNext(new BookNode(book));
		}	
		
	}
	
	
	  public int length(){
		  int count=0;
	if(this.first==null){
		
		return count;}	 
	
	  else {	 
		  BookNode current=this.first;
		  count++;
			while(current.getNext()!=null){
				current=current.getNext();
						count++;
			}
			
			return count;
			}
	}
	  
	  public BookNode getBook(int position){
		  BookNode current=this.first;
		  for(int i=1;i<=position;i++){			  
			  current=current.getNext();
		  }
		  
		  return current;
		 
	}
}

