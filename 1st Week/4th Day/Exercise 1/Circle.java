public class Circle{

	final static float pi= 3.147f;
	public static int numberOfCircles;
	private int x;
	private int y;
	private int r;

	public int getX()
{return x;}

	public void setX(int x)
{this.x=x;}

	public int getY()
{return this.y;}

	public void setY(int y)
{this.y=y;}


	public int getR()
{return this.r;}

	public void setR(int R)
{this.r=r;
	}

	public Circle(int x,int y,int r)
		{numberOfCircles++;
		this.x=x;
		this.y=y;
		this.r=r;}

	public Circle(int x,int y)
			{numberOfCircles++;
			this.x=x;
			this.y=y;
			}

	public Circle()
				{numberOfCircles++;
				this.x=0;
				this.y=0;
				this.r=1;
			}


	public void print (){
		System.out.println("I'm a circle at point ("+x+","+y+") with radius "+r);
		}

	public float calculatePerimeter (){

			return(2*this.pi*this.r);

		}

	public float calculateArea (){
				return((this.pi*(float)Math.pow(this.r,2)));
		}

	public Circle copy()

	{Circle temp=new Circle();
	temp.x=this.x;
	temp.y=this.y;
	temp.r=this.r;
	return temp;}

	public boolean cocentric(Circle circle2){

		if(circle2.x==this.x && circle2.x==this.y)
		return true;
		else
		return false;


		}

}