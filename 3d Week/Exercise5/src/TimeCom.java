
public class TimeCom {

    private int hours;
    private int minutes;
    private int seconds;
    
    
    public TimeCom(){}
    
    public TimeCom(int hours, int minutes,int seconds){
    	setHours(hours);
    	setMinutes(minutes);
    	setSeconds(seconds);
    }
    
    public String toString(){
    	
    	return getHours()+":"+getMinutes()+":"+getSeconds();
    }
    
    
    public void setTime(int hours, int minutes,int seconds){
    	setHours(hours);
    	setMinutes(minutes);
        setSeconds(seconds);    	
    }
    
    
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours>23||hours<0){
			this.hours=0;
		}
		else{
			this.hours = hours;
		}
		
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		
		if(minutes>59||minutes<0){
			this.minutes=0;
		}
		else{
			this.minutes = minutes;
		}
	
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		
		if(seconds>59||seconds<0){
			this.seconds=0;
		}
		else{this.seconds = seconds;
			
		}
	
		
		
	}
}
