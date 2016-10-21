import java.util.Scanner;

public class UI {

	public static Scanner read = new Scanner(System.in);

	public static void ui(Librarian the_guy) {

		boolean flag = true;
		while (flag == true) {
			System.out.println(
					"\r\n\r\nWelcome to library, your options are\r\n1. Show all available books\r\n2. Search for a book (by book title)"
							+ "\r\n3. Display books from a specific author\r\n4. Show all registered users\r\n5. Add new user"
							+ "\r\n6. Rent book\r\n7. Return book\r\n8. Print pending transactions\r\nq. Quit \r\nplease choose your option:");
			String input = read.nextLine();
			String user;

			switch (input) {

			case "1":
				the_guy.findMeAvailableBooks();
				break;
			case "2":
				System.out.println("please input book title:");
				input = read.nextLine();
				the_guy.findMeBook(input);

				break;
			case "3":
				System.out.println("please input author's name:");
				input = read.nextLine();
				the_guy.findMeBooksFromAuthor(input);

				break;

			case "4":
				the_guy.printAllUsers();

				break;
			case "5":
				System.out.println("please input users's name:");
				input = read.nextLine();
				System.out.println("please input date as dd/mm/yyyy");
				String date=read.nextLine();				
				the_guy.registerUser(input, date);
				System.out.println(the_guy.searchForUser(input).toString());
				break;
			case "6":
				System.out.println("please input book title:");
				input = read.nextLine();
				System.out.println("please input user's name");
				user=read.nextLine();				
				the_guy.rentBook(input, user);
				
				break;	
				
			case "7":
				System.out.println("please input book title:");
				input = read.nextLine();
				System.out.println("please input user's name");
				user=read.nextLine();				
				the_guy.returnBook(input, user);
				
				break;	
			case "8":
							
				the_guy.printPendingTransactions();
				
				break;		
			case "q":
				flag = false;
				break;
			default:
				break;

			}
		}

	}

}