import java.util.Scanner;
public class Exercise3{

	public static void main (String args[]){
		Scanner read=new Scanner (System.in);
          int a;
         int b;
          int c;
          double area;
         System.out.println("give A side of triangle");
         a=read.nextInt();
         System.out.println("give B side of triangle");
		 b=read.nextInt();
		  System.out.println("give C side of triangle");
		 c=read.nextInt();
		 area=Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/4;

        System.out.println("The area of your triangle is "+area);





  		}

	}