import java.util.ArrayList;

public class AuthorList {

	private ArrayList<Author> authors;
	
	public Author getAuthor(int position){
		return authors.get(position);	
		
	}
	
	public void setAuthor(Author author, int position){
		authors.add(position, author);
		
	}
	
	public AuthorList(Author[] author){
		this.authors=new ArrayList<Author>();
		 for(int i=0;i<author.length;i++){
			 addAnAuthor(author[i]);
			  
		   }
			
		
	}
	
   public void addAnAuthor(Author author){
		authors.add(author);	
		
	}	
   

   
   public void removeAnAuthor(Author author){
 		authors.remove(author);	
 		
 	}
   
   public Author findAnAuthor(String name){
	   for(int i=0;i<authors.size();i++){
		   
		   if(authors.get(i).name.equalsIgnoreCase(name))
			   return authors.get(i);
		  
	   }
	   return null;		
	}
   
   public void printNumber(){
	   System.out.println("the number of authors is "+authors.size());
	   
	      }
	
   public Author searchAuthor(String name){
	   		for(int i=0;i<authors.size();i++){
		   
	   				if(authors.get(i).getName().equalsIgnoreCase(name)){
	   					return authors.get(i);
	   				}	   				  					
	   				
	   }
		return null;
	   
	      }
   
   public int size(){
		return authors.size();	
		
	}
   
}
