
public class ResizableCircle extends Circle implements Resizable{

	
	public ResizableCircle(int radius) {
		super(radius);
	}
	
	@Override
	public void resize(double percentage) {
		this.setRadius((int)(this.getRadius()*(1+percentage)));
		
	}

	
		
	}
	
	


