import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
 
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a;
		int b;
		boolean success=false;
		
		
		while(!success){
			try{
			System.out.println("please input first number:");
			a=read.nextInt();
			System.out.println("please input second number:");
			b=read.nextInt();
			
			System.out.println(Quotient.calcQuotient(a, b));
			
			success=true;
			
		    }
		    catch(InputMismatchException e){
			System.out.printf("%s\n",e);
			read.nextLine();
			
		    }
			
			 catch(ArithmeticException e){
					System.out.printf("%s\n",e);
					read.nextLine();
					
				    }

		}
		
		
		
		
	
	}

}
