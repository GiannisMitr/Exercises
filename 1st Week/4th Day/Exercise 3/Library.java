public class Library{

		private Book[] books;

		public Library(Book[] books){
			this.books=new Book[books.length];
			for(int i=0;i<books.length;i++){

				this.books[i]=books[i];
			}
		}

		public void printAvailables(){
			for(int i=0;i<books.length;i++){

					if (books[i].isAvailable()){
						System.out.println(books[i].toString());
						}

			}
		}

		public void printBookDetails(String title){
            boolean temp=false;
			for(int i=0;i<books.length;i++){
				if (books[i].title.equals(title)){
					System.out.println(books[i].toString());
					temp=true;
				    }
			}
				if (temp==false) {
					System.out.println("This title is not available");
				}
			}


		public void printBookFromAuthor(String author){
            boolean temp=false;
			for(int i=0;i<books.length;i++)
			{
				if (books[i].author.name.equals(author)){
					System.out.println(books[i].toString());
					temp=true;
                 }
			}
				if (temp==false) {
					System.out.println("This title is not available");
				}
			}

}