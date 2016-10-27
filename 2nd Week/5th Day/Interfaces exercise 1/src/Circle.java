
public class Circle implements Shape {

	
	
	protected int radius;
	
public Circle(int radius) {
		this.setRadius(radius);
	}
	
	@Override
	public void getParameter() {
		
		
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public String toString(){
		return "I am a circle of Radius: "+this.radius;
		
	}
}
