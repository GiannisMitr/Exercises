public class Customer{
///statics
private static int counter=0;
private static Customer[] array= new Customer[10];

private static void arrayPush(Customer customer){
	///use the counter of the objects to write in the array
	///starting again from the start when it is full;
	Customer.array[(counter%Customer.array.length)-1]=customer;

		}



///object's variables and methods
private int code;
private String name;
private int yearOfBirth;
private String sex;

///constructor
public Customer(String name, int yearOfBirth, String Sex){
	    Customer.counter++;///update counter
	    this.setCode(Customer.counter);
        this.setName(name);
        this.setYearOfBirth(yearOfBirth);
        this.setSex(Sex);
        Customer.arrayPush(this);///push this object to the array
}


public String toString(){
	return ("Customer Object with code:"+this.getCode()+", name:"+this.getCode()+", Born in "+this.getYearOfBirth()+","+this.getSex());

	}

///getters
public int getCode(){
	return this.code;
	}

public String getName(){
	return this.name;
	}

public int getYearOfBirth(){
	return this.yearOfBirth;
	}

public String getSex(){
	return this.sex;
	}


///setters
public void setCode(int code){
	this.code=code;
	}

public void setName(String name){
	this.name=name;
	}

public void setYearOfBirth(int yearOfBirth){
	if(yearOfBirth>=1900){
		this.yearOfBirth=yearOfBirth;
		}
	else{
		this.yearOfBirth=0;
		}
	}

public void setSex(String sex){
	if(sex.equals("Male") || sex.equals("Female")){
		this.sex=sex;
		}
	else{
		this.sex="";
		}
	}


}