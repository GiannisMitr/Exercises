import java.util.Date;
import java.util.LinkedList;

public class UserList {
	
private LinkedList<User> userList;

public UserList(){	
	userList=new LinkedList<>();
}

public void addUser(String name, Date dateOfRegister){
	
	User temp=new User(name, dateOfRegister);
	userList.add(temp);
}

public User search (String name){
	
	for(int i=0 ;i<userList.size();i++){
		
		if(userList.get(i).getName().equalsIgnoreCase(name)){
			return userList.get(i);
		}
		
	}
	return null;
}

public void printAll(){
	
for(int i=0 ;i<userList.size();i++){
		System.out.println(userList.get(i).toString());
		}
		
	}
	

}
