import java.util.Scanner;
import java.util.Arrays;
public class Exercise3{

	public static void shift (int [] numbers, int times)
	{


		int temp1;
		int temp2;
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
		int[]numbers=new int[]{1,2,3,4,5,6,7,8,9,10};
		shift(numbers,times);

		}




	}