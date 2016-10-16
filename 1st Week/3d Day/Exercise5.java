import java.util.Scanner;
import java.util.Arrays;
public class Exercise5{

public static Scanner read=new Scanner (System.in);
 public static String matrix [][] = {{"","",""},{"","",""},{"","",""}};
        public static int count=0;
        public static int win=2;
	public static void draw ()

	{///Runtime.getRuntime().exec("cls");
		System.out.println(" "+ matrix[0][0] + " | " + matrix[0][1] + " | "+matrix[0][2] + " ");
		  System.out.println(" "+"-"+"---"+"-"+"---"+"-"+" ");
		  System.out.println(" "+matrix[1][0]+" | "+matrix[1][1]+" | "+matrix[1][2]+" ");
		   System.out.println(" "+"-"+"---"+"-"+"---"+"-"+" ");
		  System.out.println(" "+matrix[2][0]+" | "+matrix[2][1]+" | "+matrix[2][2]+" ");


}

public static int play (int player)
	{
		String move;
		boolean validRow=true;
		boolean validColumn=true;
		boolean validX=true;
		boolean validY=true;

		int row=1;
		int column=1;
		if(player==1){
		System.out.println("first player plays");
		move="x";}
		else{
		System.out.println("second player plays");
		move="o";}
		System.out.println("Please input the row number 1, 2 or 3");
				row=read.nextInt();
		System.out.println("Please input the column number 1, 2 or 3");
	   column=read.nextInt();
		while (!check(row,column).equals("play")){
			if(!check(row,column).equals("occupied"))
				System.out.println("this cell is occupied, input again row");
		     else
		        System.out.println("this is not a valid cell must be 1, 2 or 3, input again row");
		row=read.nextInt();
		System.out.println("input again column");
	}
	matrix[row-1][column-1]=move;



	for (int i=0;i<3;i++)
	{
	if(matrix[i][column-1].equals(move))
	{validRow=true&&validRow;

	}
	else
	{validRow=false;
	}
	if(matrix[row-1][i].equals(move))
	{validColumn=true&&validColumn;
	} else {
		validColumn=false;
	}
	if(matrix[i][i].equals(move))
	{validX=true&&validX;}
	else
	{validX=false;}
	if(matrix[i][2-i].equals(move))
	{validY=true&&validY;}
	else
	{validY=false;}
     }
      draw();
     if (validRow||validColumn||validX||validY)
     return player;///winner

     else
     return 2;

	}



public static String check (int row, int column)
	{
		if (row>=1&&row<=3&&column>=1&&column<=3)
		{
		    if(matrix[row-1][column-1]!="")
		       return "occupied";
		    else
		      return "play";
	 }
	 else
	     return "invalid";
		}


	public static void main (String args[])
	{

		System.out.println("Hello. Welcome to Triliza game");

		while (win==2)
		{   count++;
		    if(count>9)
		    {
		    System.out.println("this is a draw");
		    break;}

		    win=play(count%2);
	   }
	   if (win==1)
	   System.out.println("First player wins");
       else if(win==0)
       System.out.println("Second player wins");


	    }
		}




