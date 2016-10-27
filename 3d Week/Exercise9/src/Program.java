import java.math.BigInteger;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		BigInteger big=new BigInteger("600851475143");
		
		
		BigInteger d=new BigInteger("2");
        
		
		
		ArrayList<BigInteger> temps = new ArrayList<BigInteger>();
		
		while(big.compareTo(BigInteger.ONE)==1){
			while(big.divideAndRemainder(d)[1].compareTo(BigInteger.ZERO)==0){
				temps.add(d);
				
				big=big.divide(d);
			}
				d=d.add(BigInteger.ONE);			
				
			}
		
//		for(int i=0;i<temps.size();i++){
//		System.out.println(temps.get(i).toString());
//		}
			System.out.println(temps.get(temps.size()-1).toString());
			
			
			
		}

	}
	

