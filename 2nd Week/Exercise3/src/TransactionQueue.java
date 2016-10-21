import java.util.ArrayList;

public class TransactionQueue {

	private  ArrayList<Transaction> transactions;
	
	public TransactionQueue(){
		this.transactions=new ArrayList<Transaction>();
		
	}
	
	public  void add(Transaction trans){
		transactions.add(trans);
	}
	
	
	public  int size(){
		return transactions.size();
	}
	
	public Transaction getTrans(int position){
		return transactions.get(position);	
		
	}
	
	
	public Transaction remove(){
		Transaction temp= transactions.get(0);
		transactions.remove(0);
		return temp;
		
	}
	
	 public void printPendingTransactions(){
	    	
		 for(int i=0;i<transactions.size();i++)
			{System.out.println("OPEN "+transactions.get(i).toString());
                 }
	    }
		
	

	
}
