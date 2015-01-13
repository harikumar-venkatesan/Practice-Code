package tryouts;

public class Coin_dynamic {

	static int denominations[] = {11,9,7,5,1};
	static int size = 5;
	static int size_array = 231;
	static int least_num [] = new int[size_array];
	public Coin_dynamic() {
		// TODO Auto-generated constructor stub
	}
	
public static int num_calculation(int num)
{
	for(int i=0;i<size_array; i++)
	{
		least_num[i] = -1;
	}
	return num_calc(num);
}
public static int num_calc(int num)
{
	int lval = 1000000;
	if(num<1)
		return 0;
	
	for(int i=0; i<size; i++)
	{
		if(num == denominations[i])
			return 1;
	}
	if(least_num[num] != -1)
	{
		return least_num[num];
	}
	else
	{
//		System.out.println(num);
//		System.out.println("Inside else");
//		System.out.println("");
		
		for(int i=0;i<size; i++)
		{
			if(num-denominations[i] > 0)
			{
//			System.out.print(num+" " +denominations[i]);	
			lval = Math.min(lval, 1+num_calc(num-denominations[i]));
//			System.out.print(lval);
//			System.out.print("lval");
			}
			else 
				continue;
		}
		least_num[num] = lval;
		return lval;
	}
}
public static void main(String args[])
{ 
	int number = 230;
	System.out.println(num_calculation(number));
}
}
