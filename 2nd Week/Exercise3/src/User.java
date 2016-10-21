import java.util.Date;

public class User {
	
	private static int counter=0;

	private String name;
	private Date dateOfRegister;
	private final int userId;
	

	User (String name, Date dateOfRegister){
		counter++;
		this.setName(name);
		this.userId=counter;
		this.dateOfRegister=dateOfRegister;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public int getUserId() {
		return userId;
	}
	public Date getDateOfRegister() {
		return dateOfRegister;
	}
	public void setDateOfRegister(Date dateOfRegister) {
		this.dateOfRegister = dateOfRegister;
	}
	
	public String toString(){
		return "User named: "+this.getName()+", with id: "+this.getUserId()+",  Registered at: "+this.getDateOfRegister().toString();
		
		
	}

	
	
	
	
}
