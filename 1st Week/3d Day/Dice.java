
	public class Dice{
		private int Dice1=0;
		private int Dice2=0;
		private int counter=0;
		public void roll()
		{

			while(!(Dice1==1 && Dice2==1))
			{
			counter++;

			Dice1=(int)(1 + Math.random()*6);
			Dice2=(int)(1 + Math.random()*6);
			System.out.println("number of rolls needed:"+ counter);
			}

     System.out.println("number of rolls needed:"+ counter);
		}
	}