
public class Program {

	public static void main(String[] args) {
		
		Rectangle rect1=new Rectangle();
		System.out.println(rect1);
		Rectangle rect2=new Rectangle(5,5);
		System.out.println(rect2);
		System.out.println(rect2.isSquare());
		Rectangle rect3=new Rectangle(5,5);
		System.out.println(rect3.areEqual(rect2));
		System.out.println(rect3.areEqual(rect1));
		rect2.draw();
		rect1.draw();
		Rectangle rect4=new Rectangle(10,15);
		Rectangle rect5=rect4.copy();
		rect4.draw();
		
		
		

	}

}
