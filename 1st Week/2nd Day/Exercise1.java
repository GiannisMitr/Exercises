import java.util.Scanner;
public class Exercise1{
	public static void main (String args[]){
         System.out.println("Please provide your number");
         Scanner read=new Scanner (System.in);
         String number=read.nextLine();
         String a="";
         int result=0;
         for (int i=1; i<=8;i++)
         { int temp;
			 a=number.substring(number.length()-i-1,number.length()-i);
           temp=Integer.parseInt(a);

			 result+=temp*Math.pow(2,i);

			 }
			 result=(result%11)%10;
			 if(result==Integer.parseInt(number.substring(number.length()-1,number.length())))
			    System.out.println("This is a Valid Number!");
            else
               System.out.println("This is not a Valid Number!");


		}




	}