
public class TestShape {

	public static void main(String[] args) {
		
		Shape[] shapes= new Shape[10];
		
		
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
		
		Shape rec1 = new Rectangle(2,3);
		Rectangle rec2 = new Rectangle(3,5);
		System.out.println(rec2.isSquare());
		System.out.println(((Rectangle)rec1).areEqual(rec2));
		System.out.println(rec2.area());
		System.out.println(rec2.perimeter());
		
		shapes[0]=rect2;
		shapes[1]=rect4;
		shapes[2]=new Circle(5);
		shapes[3]=rec1;
		shapes[4]=new Circle(10);
		shapes[5]=new Circle(0);
		
		for(int i=0;i<shapes.length;i++){
			if(shapes[i]!=null){
				System.out.println(shapes[i]);
				System.out.println(shapes[i].area());
			   if(shapes[i] instanceof Rectangle){
				System.out.println(((Rectangle)shapes[i]).isSquare());
			   }
			   else if(shapes[i] instanceof Circle){
				   System.out.println(((Circle)shapes[i]).getRadius());
			   }
			}
			
		}
		
		
		
		
		

	}

}
