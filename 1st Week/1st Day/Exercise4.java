import java.util.Scanner;
public class Exercise4{

	public static void main (String args[]){
		Scanner read=new Scanner (System.in);
          double a;
         double b;
          double c;
          double d;
          double root1;
          double root2;
         System.out.println("please give equation's parameter a ");
         a=read.nextDouble();
         System.out.println("please give equation's parameter b ");
		 b=read.nextDouble();
		  System.out.println("please give equation's parameter c ");
		 c=read.nextDouble();
		 d=Math.pow(b,2)-(4*a*c);
		 if(d<0)
		 System.out.println("there are no real solutions");
		 else{
		 root1=(-b+Math.sqrt(d))/(2*a);
		 root2=(-b-Math.sqrt(d))/(2*a);
		 System.out.println("the roots are:"+root1+" , "+root2);
	  }

  		}

	}