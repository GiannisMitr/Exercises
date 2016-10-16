import java.util.Scanner;
public class Exercise2{
	public static void main (String args[]){
         System.out.println("Please provide your 8 bits sequence");
         Scanner read=new Scanner (System.in);
         String number=read.nextLine();
         String a="";
         int result=0;
         for (int i=1; i<8;i++)
         { int temp;
			 a=number.substring(number.length()-i-1,number.length()-i);
           temp=Integer.parseInt(a);
           if (temp==1)
			 result+=temp;

			 }

			 if(result%2==Integer.parseInt(number.substring(number.length()-1,number.length())))
			    System.out.println("Parity check OK.");
            else
               System.out.println("Parity check not OK.");


		}




	}