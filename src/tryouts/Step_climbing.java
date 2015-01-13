package tryouts;

import java.util.ArrayList;

public class Step_climbing {
	static int size = 105;
	static int memLoc[] = new int[size];
	public Step_climbing() {
		// TODO Auto-generated constructor stub
		
	}

public static int steps_recursive(int num)
{
	if(num<=1)
	{
		return 1;
	}
	else
		{
		return steps_recursive(num-1) + steps_recursive(num-2);
		
		}
	
}

public static int steps_compute(int num)
{
	for (int i=0; i<size; i++)
	{
		memLoc[i] = -1;
	}
	return steps_dp(num);
}

public static int steps_dp(int num)
{
	//System.out.println("Inside");
	if(num<=1)
	{
	//	System.out.println("less= 1");
		return 1;
	}
	else if(memLoc[num] != -1)
		{
	//	System.out.println("dp shows");
		return memLoc[num];
		}
	else
	{
	//	System.out.println(num);
		memLoc[num] = steps_dp(num-1) + steps_dp(num-2);
		return memLoc[num];
	}
	
}

public static void main(String args[])
{
	int number = 80;
	long startTime = System.currentTimeMillis();
//	sSystem.out.println(steps_recursive(number));
//	System.out.println(System.currentTimeMillis() - startTime);
	
	startTime = System.currentTimeMillis();
	System.out.println(steps_compute(number));
	System.out.println(System.currentTimeMillis() - startTime);
	
}
}
