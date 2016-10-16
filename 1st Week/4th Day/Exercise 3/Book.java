public class Book{


public String title;
public Author author;
public final String isbn;
public int physicalCopies;
public int availableCopies;
public int timesRented;

public Book(String title, Author author,String isbn,int physicalCopies,int availableCopies,int timesRented){

	this.title=title;
	this.author=author;
	this.isbn=isbn;
	this.physicalCopies=physicalCopies;
	this.availableCopies=availableCopies;
	this.timesRented=timesRented;
}


public String toString(){
	return ("Title:"+title+", Author:"+author.toString()+", isbn: "+isbn);

	}

public void rentPhysicalCopy(){
	if (availableCopies>0)
	{
	System.out.println("There is an Available copy");
	availableCopies++;
}
	else
	System.out.println("a copy of this book is not available at the moment, sorry!");

	}

	public boolean isAvailable(){
		if (availableCopies>0)
		return true;
		else
		return false;
		}

public boolean hasAuthor(String author){
		if (this.author.name.equals(author))
		return true;
		else
		return false;
		}


}