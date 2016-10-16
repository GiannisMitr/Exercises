import java.util.Scanner;

public class UI{

public static Scanner read=new Scanner (System.in);
public static void main (String args[]){

///initiallize test objects
Customer john=new Customer("john mitropoulos",1986,"Male");
Customer maria=new Customer("maria pentagiotisa",1906,"Female");
Customer kwstas=new Customer("kwstas papadopoulos",1983,"Male");

Insurance one=new Insurance(john,12);
Insurance two=new Insurance(john,5);
Insurance three=new Insurance(maria,34);
Insurance four=new Insurance(kwstas,30);

Life one1=new Life(john,185,1000);
Life two1=new Life(john,4,3000);
Life three1=new Life(maria,37,500);

Health one2=new Health(john,3,300);
Health two2=new Health(kwstas,17,300);
Health three2=new Health(maria,7,300);

Life one12=new Life(john,185,2000);


///main UI

int input;
boolean flag=true;
boolean mainFlag=true;
while(mainFlag==true)
{
	System.out.println("\r\n***** Menu ******\r\n1. Print all Insurances\r\n2. Search insurances by customer code\r\n3. Search insurances by insurance code \r\n0. Exit");
String choise=read.nextLine();

switch (choise){

	case "1":
	         Insurance.printAll();
	         break;
	case "2":
	         System.out.println("please input customer's code:");
	         input=Integer.parseInt(read.nextLine());
	         flag=Insurance.printByCustomerCode(input);
	         while(!flag){
				 System.out.println("an insurance with this customer's code doesn't exist\r\nPlease input another one or  '0' to exit:");
				 input=Integer.parseInt(read.nextLine());
				 if(input!=0){
				  flag=Insurance.printByCustomerCode(input);
				  }
				 else{break;}
		     }
	         break;
	case "3":
	         System.out.println("please input insurance's code:");
			 	         input=Integer.parseInt(read.nextLine());
			 	         flag=Insurance.printByInsuranceCode(input);
			 	         while(!flag){
			 				 System.out.println("an insurance with this Insurances's code doesn't exist\r\nPlease input another one or  '0' to exit:");
			 				 input=Integer.parseInt(read.nextLine());
			 				 if(input!=0){
			 				  flag=Insurance.printByInsuranceCode(input);
			 				  }
			 				 else{break;}
			 		     }
	         break;

 	case "0":
 	mainFlag=false;
 	  break;
 	default:
 	break;

		 }
}





}


}