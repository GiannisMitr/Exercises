public class Life extends Insurance{

private static int counter=0;
private static Life[] array= new Life[10];

private static void arrayPush(Life life){
	///use the counter of the objects to write in the array
	///starting again from the start when it is full;
	life.array[(counter%Life.array.length)-1]=life;

		}



///object's variables and methods
private int amount;


///constructor
public Life(Customer customer, int duration, int amount){
	    super(customer, duration);
	    Life.counter++;///update counter
        this.setAmount(amount);
        Life.arrayPush(this);///push this object to the array

}


@Override
public String toString(){
	return ("Life Object with code:"+this.getCode()+", belonging to customer with code:"+this.getCustomerCode()+", with duration "+this.getDuration()+", with amount of "+this.getAmount());

	}

@Override
public int insuranceCost(){

     return (100+(2016-this.getCustomerYearOfBirth())*5);

	}


///getters
public int getAmount(){
	return this.amount;
	}




///setters


public void setAmount(int amount){
		this.amount=amount;

	}


}