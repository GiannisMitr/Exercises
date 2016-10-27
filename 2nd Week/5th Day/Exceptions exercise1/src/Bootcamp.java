
public class Bootcamp {

	public static void welcome(double arg) throws DigitException, AnotherDigitException{
		if (arg > 25.0) {
		    throw new DigitException();
		}
		else{
			throw new AnotherDigitException();
			
		}
		
	}
	
	public static int bye (){
		
		try{
		Bootcamp.welcome(245);
		}
		catch(DigitException temp){
			temp.printStackTrace();
			return 605;
		}
		catch(AnotherDigitException temp){
			temp.printStackTrace();
			return 230;
		}
		
		return 0;
	}
}
