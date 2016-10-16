public class Health extends Insurance{

private static int counter=0;
private static Health[] array= new Health[10];

private static void arrayPush(Health health){
	///use the counter of the objects to write in the array
	///starting again from the start when it is full;
	health.array[(counter%Health.array.length)-1]=health;

		}



///object's variables and methods
private int medicalExpense;


///constructor
public Health(Customer customer, int duration, int medicalExpense){
	    super(customer, duration);
	    Health.counter++;///update counter
        this.setMedicalExpense(medicalExpense);
        Health.arrayPush(this);///push this object to the array
}


@Override
public String toString(){
	return ("Health Object with code:"+this.getCode()+", belonging to customer with code:"+this.getCustomerCode()+", with duration "+this.getDuration()+", with medical Expenses of "+this.getMedicalExpense());

	}

@Override
public int insuranceCost(){

     if(this.getCustomerSex().equals("Male")){
		 return (150+(2016-this.getCustomerYearOfBirth())*7);
		 }
	else{
		 return (100+(2016-this.getCustomerYearOfBirth())*7);
		}
     }


///getters
public int getMedicalExpense(){
	return this.medicalExpense;
	}




///setters


public void setMedicalExpense(int medicalExpense){
		this.medicalExpense=medicalExpense;

	}


}