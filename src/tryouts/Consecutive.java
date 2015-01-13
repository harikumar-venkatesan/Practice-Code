package tryouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Consecutive {

	public Consecutive() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[])
{
	ArrayList<Integer> series = new ArrayList<Integer>();
	series.add(4);
	series.add(1);
//	series.add(4);
//	series.add(6);
//	series.add(1);
	series.add(100);
//	series.add(7);
	int count = 0;
	Collections.sort(series);
	Iterator<Integer> iter_behind = series.iterator();
	Iterator<Integer> iter_ahead = series.iterator();
	iter_ahead.next();
	while(iter_ahead.hasNext())
	{
		int behind = iter_behind.next();
		int ahead = iter_ahead.next();
		if(behind+1 != ahead)
		{
			count += ahead - behind -1;
		}
	}
	System.out.println(count);
}
}
