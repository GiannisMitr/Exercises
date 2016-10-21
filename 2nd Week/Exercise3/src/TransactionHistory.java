import java.util.ArrayList;

public class TransactionHistory {
	
	private  ArrayList<Transaction> transactions;
	
	public TransactionHistory(){
		this.transactions=new ArrayList<Transaction>();
		
	}
	
	public  void add(Transaction trans){
		transactions.add(trans);
	}
	
	public  Transaction remove(){
		Transaction temp= transactions.get(0);
		transactions.remove(0);
		return temp;
		
	}
	
	public void printFinishedTransactions(){
    	
		 for(int i=0;i<transactions.size();i++)
			{System.out.println("CLOSED "+transactions.get(i).toString());
                }
	    }

}
