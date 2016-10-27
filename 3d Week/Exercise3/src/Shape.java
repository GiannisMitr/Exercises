
public abstract class Shape {

	int numberOfSides;
	
	public Shape(){}
	
	public Shape(int sides){
		
		this.setNumberOfSides(sides);
	}
	
	public String toString(){
		return "I am a shape but Abstract";
		
	}
	
	public abstract double area();
	
	public abstract double perimeter();
    public abstract void draw();
	

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
}
