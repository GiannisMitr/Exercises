
public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(){}
	
	public Rectangle (int length, int width){
		
		this.length=length;
		this.width=width;
	}
	
	
	public String toString(){
		
		return "I am a Rectangle with width "+getWidth()+" and height "+getLength();
	}
	 
	
	public boolean areEqual(Rectangle rect){
		
		if (this.getLength()==rect.getLength() && this.getWidth()==rect.getWidth()){
			return true;
		}
		else
			return false;
	}
	
	public boolean isSquare(){
		
		if(this.getLength()==this.getWidth()){
			return true;
		}
		else
			return false;
	}
	
	
	public void draw(){
		
		for(int i=0;i<this.getLength();i++){
			System.out.println();
			if(i==0 || i==(this.getLength()-1)){
				for(int j=0;j<this.getWidth();j++){
					System.out.print("* ");	
				}
				
			}
			else{
				for(int j=0;j<this.getWidth();j++){
					if(j==0 || j==(this.getWidth()-1)){
						System.out.print("* ");	
					}
					else{
						System.out.print("  ");	
					}
				}
				
			}
		}	
	}	
	
	
	public Rectangle copy(){
		
		Rectangle temp=new Rectangle(this.getLength(), this.getWidth());
		
	return temp;
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
}
