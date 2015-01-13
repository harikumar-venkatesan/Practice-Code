package tryouts;

import java.util.HashSet;
import java.util.Set;

public class PrimeChecker {

	public static Boolean output = false;
	public static Set<Integer> primeNumber = new HashSet<Integer>();
	public PrimeChecker() {
		// TODO Auto-generated constructor stub'
	}
	
	public static void Compute_primes()
	{
		primeNumber.add(2);
		primeNumber.add(3);
		primeNumber.add(5);
		primeNumber.add(7);
		int number = 11;
		Boolean breakFlag = false;
		for(int z=4; z<10000; z++)
		{
			breakFlag= false;
			//System.out.println(z);
			for(int i=3; i<number/2; i+=2)
			{
				
			if(number%i==0)
			{
//				System.out.println(number);
//				System.out.println("number");
				//System.out.println(number);
				number += 2;
				breakFlag = true;
				z--;
				break;
			}
			}
			if(!breakFlag)
			{
				primeNumber.add(number);
				number += 2;
			}
		}
//	for(int item : primeNumber)
//	{
//		System.out.println(item);
//	}
	}
	
	public static void permute_number(String number)
	{
		output = false;
		permute("", number);
	}
	
	public static void permute(String done_permute, String yet_permute)
	{
		int length = yet_permute.length();
		if(length == 1)
		{
			if(!output)
			{
				output = prime_check(done_permute+yet_permute);
			}
			
		}
		else
		{
			for(int i=0; i<length; i++)
			{
				permute(done_permute+yet_permute.charAt(i), yet_permute.substring(0, i)+ yet_permute.substring(i+1));
			}
		}
	}
	
	public static Boolean prime_check(String number)
	{
		if(primeNumber.contains(Integer.parseInt(number)))
		{
			return true;
		}
		else
			return false;
		
	}
public static void main(String Args[])
{
	String number = "910";
	Compute_primes();
	permute_number(number);
	if(output)
	{
		System.out.println("Possible");
	}
	else
		System.out.println("Unpossible");
}
}
