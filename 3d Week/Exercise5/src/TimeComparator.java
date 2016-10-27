import java.util.Comparator;

public class TimeComparator implements Comparator<TimeCom> {

	

	@Override///returns the difference in seconds
	public int compare(TimeCom o1, TimeCom o2) {
		
		return(3600*(o1.getHours()-o2.getHours())+60*(o1.getMinutes()-o2.getMinutes())+(o1.getSeconds()-o2.getSeconds()));
	}
}
