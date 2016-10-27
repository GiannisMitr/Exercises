
public class Circle extends Shape {

	
	private int radius;
	public Circle(){
		super(0);
	}
	
	public Circle(int radius){
		super(0);
		this.setRadius(radius);
	}
	
	
	
	
	@Override
	public double area() {
		
		return Math.PI*Math.pow(radius, 2.0);
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
		
	}

	@Override
	public void draw() {
		System.out.println("i am a circle");
	}

	@Override
	public String toString(){
		
		return "I am a Circle with radius "+getRadius();
	}
	
	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

}
