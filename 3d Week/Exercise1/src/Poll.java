
public class Poll {
	
 private static int[] answers={1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 8, 4, 6, 8, 10};

public static int getAnswers(int position) {
	return answers[position];
}


public static void printFreq(){
	
	int temp[]=new int[10];
	for(int i=0;i<answers.length;i++){
		temp[getAnswers(i)-1]++; 
		}
	System.out.println("Rating Frequency");
	for(int i=0;i<temp.length;i++){
		System.out.println(i+1+" "+temp[i]);
		}
		
	}
}

