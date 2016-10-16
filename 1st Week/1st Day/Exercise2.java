import java.util.Scanner;
public class Exercise2{

	public static void main (String args[]){
		Scanner read=new Scanner (System.in);
          int sum;
          int temp;
         System.out.println("Enter number of 50 euro banknotes:");
        temp=read.nextInt();
        sum=temp*50;
         System.out.println("Enter number of 20 euro banknotes:");
		 temp=read.nextInt();
        sum+=temp*20;
        System.out.println("Enter number of 10 euro banknotes:");
		temp=read.nextInt();
        sum+=temp*10;
         System.out.println("Enter number of 5 euro banknotes:");
		temp=read.nextInt();
        sum+=temp*5;
        System.out.println("Enter number of 2 euro coins:");
		temp=read.nextInt();
        sum+=temp*2;
       System.out.println("Enter number of 1 euro coins:");
		temp=read.nextInt();
        sum+=temp*1;
        System.out.println("The total of your money is "+sum);






  		}

	}