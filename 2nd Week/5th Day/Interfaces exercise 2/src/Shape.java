
public class Shape implements Agreeable{

	
	private int height;
	private int width;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape(int height, int width) {
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public int calcArea(){
		
		return getHeight()*getWidth();
	}
	
	@Override
	public Boolean isSmallerThan(Agreeable other) {
		Shape temp=(Shape)other;
		
		return (temp.calcArea()>this.calcArea());
	}
	
	
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
 
	
}
