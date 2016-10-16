public class Insurance{
///statics
private static int counter=0;
private static Insurance[] array= new Insurance[10];

private static void arrayPush(Insurance insurance){
	///use the counter of the objects to write in the array
	///starting again from the start when it is full;
	Insurance.array[(counter-1)%Insurance.array.length]=insurance;

		}

public static void printAll(){

     for(int i =0;i<Insurance.array.length;i++){
         if(Insurance.array[i]!=null){

             System.out.println(Insurance.array[i].toString());
	     }
      }
}

public static boolean printByInsuranceCode(int insuranceCode){
     boolean temp=false;
     for(int i =0;i<Insurance.array.length;i++){
         if(Insurance.array[i]!=null){
			 if(Insurance.array[i].getCode()==insuranceCode){
               System.out.println(Insurance.array[i].toString());
               temp=true;
		   }
	     }
	  }
   return temp;
}

public static boolean printByCustomerCode(int customerCode){
     boolean temp=false;
     for(int i =0;i<Insurance.array.length;i++){
         if(Insurance.array[i]!=null){
			 if(Insurance.array[i].getCustomerCode()==customerCode){
               System.out.println(Insurance.array[i].toString());
               temp=true;
		   }
	     }
	  }
   return temp;
}

///object's variables and methods
private Customer customer;
private int code;
private int duration;

///constructor
public Insurance(Customer customer, int duration){
	    Insurance.counter++;///update counter
	    this.customer=customer;
	    this.setCode(Insurance.counter);
        this.setDuration(duration);
        Insurance.arrayPush(this);///push this object to the array
}


public String toString(){
	return ("Insurance Object with code:"+this.getCode()+", belonging to customer with code:"+this.getCustomerCode()+", with duration "+this.getDuration());

	}

public int insuranceCost(){

     return 100;

	}



///getters
public int getCode(){
	return this.code;
	}

public int getCustomerCode(){
	return this.customer.getCode();
	}

public int getCustomerYearOfBirth(){
	return this.customer.getYearOfBirth();
	}

public String getCustomerSex(){
	return this.customer.getSex();
	}


public int getDuration(){
	return this.duration;
	}




///setters
public void setCode(int code){
	this.code=code;
	}



public void setDuration(int duration){
		this.duration=duration;

	}



}