package tryouts;

public class SequenceCheck {

	public SequenceCheck() {
		// TODO Auto-generated constructor stub
	}
	
	public static String arithmetic(int series[])
	{
		int diff = series[1] - series[0];
		if(series.length == 2)
		{
			return "Arithmetic";
		}
		
		for(int i=1; i<series.length-1;i++)
		{
			if(series[i] + diff != series[i+1])
				return "Not Arithmetic";
		}
		
		return "Arithmetic";
	}
	
	public static String geometric(int series[])
	{
		float diff = series[1]/ series[0];
		if(series.length == 2)
		{
			return "Geometric";
		}
		
		for(int i=1; i<series.length-1;i++)
		{
			if(series[i] * diff != series[i+1])
				return "Not Geometric";
		}
		
		return "Geometric";
	}
	
public static void main(String args[])
{
	int series[] = {2,6,18,54};
	
	System.out.println(arithmetic(series));
	System.out.println(geometric(series));
	
	
	
	
}
}