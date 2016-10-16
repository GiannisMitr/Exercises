import java.util.Scanner;
import java.util.Arrays;
public class Exercise4{

	public static void shift (Double [] numbers, int times)
	{


		Double temp1;
		Double temp2;
		System.out.println(Arrays.toString(numbers));
		for (int i=0; i<times;i++)
         {

                 temp1= numbers[numbers.length-1];
			 		for (int j=0; j<numbers.length;j++)
                     {

						 temp2=numbers[j];
						numbers[j]=temp1;
						temp1=temp2;

					 }
					 System.out.println(Arrays.toString(numbers));
		}

}
	public static void main (String args[])
	{

		System.out.println("how many times to shift right?");
		Scanner read=new Scanner (System.in);
         int times=read.nextInt();
		Double[]numbers=new Double[]{(double)1,(double)2,(double)3,(double)4,(double)5,(double)6,(double)7,(double)8,(double)9,(double)10};
		shift(numbers,times);

		}




	}