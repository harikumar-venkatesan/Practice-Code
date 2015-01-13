package tryouts;

import java.io.IOException;
import java.util.ArrayList;

public class NthPrime {
	
	public static ArrayList<Integer> table = new ArrayList<Integer>();
	
	public NthPrime() {
		// TODO Auto-generated constructor stub
	}

	public static void compute_table()
	{
		int counter = 3;
		table.add(2);
		table.add(3);
		table.add(5);
		int number = 7; 
		int flag = 0;
		while(counter < 10000)
		{
		//	System.out.println(counter);
//			if(number % 2 == 0)
//			{
//				System.out.println(number+" dai");
//				
//				number += 2;
//				continue;
//			}
//			else
//			{
				int i;
				flag = 0;
				for( i=3; i<number/2; i+=2)
				{
					if(number%i == 0)
					{
						flag = 1;
						number+=2;
						break;
					}
				}
				if(flag == 0)
				{	
					table.add(number);
					number+= 2;
					counter ++;
//					System.out.println("?");
				}
			//}
		}
	
	}
	
	public static int get_print(int N)
	{
		return table.get(N);
	}
	
	public static void main(String[] args) throws IOException {
		
		NthPrime iter = new NthPrime();
		iter.compute_table();
		System.out.println(iter.get_print(1435));
		
	}

}
