import java.util.Scanner;
import java.util.Arrays;
public class Exercise1{
	public static void main (String args[]){
         System.out.println("Please provide your first number");
         Scanner read=new Scanner (System.in);
         int number1=read.nextInt();
         System.out.println("Please provide your second number");
         int number2=read.nextInt();

               System.out.println(bootCamp(number1,number2));


		}

                 public static int bootCamp (int number1, int number2){

					 if(number1<number2)
					 {return (int)Math.sqrt(Math.abs(number2-number1));}
					 else
					 {return number2+number1;}

                  }

	}