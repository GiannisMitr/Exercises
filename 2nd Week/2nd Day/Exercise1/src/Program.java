
public class Program {
	static int[] array = {1, 3, 1, 2, 5, 6, 1, 8, 9, 12, 1, 13, 13, 1};

	public static void main(String[] args) {
		int min=2000000000;
		String  positions="";
		
		for (int i=0 ;i<array.length;i++){
			if(min>array[i]){
			 min=array[i];
			 positions=Integer.toString(i);
			}
			else if(min==array[i]){
		     positions=positions+", "+i;	
			}
			
			}	
							
		System.out.println("the min is "+min+", in positions: "+positions);
		

	}

}
