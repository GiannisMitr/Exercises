
public class Program {

	public static void main(String[] args) {
		
		TimeCom time1=new TimeCom(12,43,56);
		TimeCom time2=new TimeCom(22,33,3);
		TimeComparator comp=new TimeComparator();
		System.out.println(comp.compare(time1, time2));///difference in seconds
		
	}

}
