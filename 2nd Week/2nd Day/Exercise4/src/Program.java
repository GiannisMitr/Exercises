import java.util.Scanner;

public class Program {
	public static  Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("please input word to check");
		String word = read.nextLine();		
		
		
		if(checkPalindrome(word)){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("It is NOT a palindrome");
		}
	}
		
	private static boolean checkPalindrome(String word) {
		
				
		for(int i=0; i<word.length()/2;i++){
				if(word.charAt(i)!=word.charAt(word.length()-1-i)){
					return false;
				}				
	}
		return true;
	}

}
