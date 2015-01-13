package tryouts;

public class Gcd {

	public Gcd() {
		// TODO Auto-generated constructor stub
	}
	
	public static int GCD_Compute(int max, int min)
	{
//		System.out.println(max);
//		System.out.println(min);
		if(min == 0)
			return max;
		else
		return GCD_Compute(min, max%min);
	}
public static void main(String args[])
{
	int num1 = -100, num2= -56;
	
	int max = Math.max(num1, num2);
	int min = num1+num2-max;
	
	if(max%min == 0)
		System.out.println(min);
	else
		System.out.print(GCD_Compute(max,min));
	
}
}
