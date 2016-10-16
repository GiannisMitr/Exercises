import java.util.Scanner;
public class Exercise9{
	public static void main (String args[]){
		String [] alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
         System.out.println("Please input your phraze with capital letters");
         Scanner read=new Scanner (System.in);
         String phraze=read.next();
            System.out.println("how many letters shuffle?");

         int number=read.nextInt();
         String encrypted="";
         String a="";
         for (int i=0; i<phraze.length();i++)
         {
			 a=phraze.substring(i,i+1);

			 for (int k=0; k<alphabet.length;k++)
			 {
            if (a.equals(alphabet[k]))

              {encrypted=encrypted.concat(alphabet[(k+number)%26]);}
	   }
   }

			    System.out.println(encrypted+"\r\nDo you want to Decrypt it>??");
			    a=read.next();
			    if(a.equals("yes"))
			    {
					phraze="";
					for (int i=0; i<encrypted.length();i++)
         {
			 a=encrypted.substring(i,i+1);

			 for (int k=0; k<alphabet.length;k++)
			 {
            if (a.equals(alphabet[k]))

              {phraze=phraze.concat(alphabet[(k-number)%26]);}
		  }
     	}
System.out.println(phraze);
}
	}
}