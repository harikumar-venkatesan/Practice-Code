package tryouts;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

	public NextPermutation() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[])
{
	int number = 99976899;
	String number_copy = Integer.toString(number);
	String number_copy_rev = new StringBuilder(number_copy).reverse().toString(); 
	Boolean ascFlag = true;
	Boolean descFlag = true;
	
	for(int i=0;  i<number_copy.length()-1; i++)
	{
		if(Character.getNumericValue(number_copy.charAt(i)) < Character.getNumericValue(number_copy.charAt(i+1)))
			continue;
		else
			ascFlag = false;
			break;
	}
//	System.out.println(ascFlag);
	for(int i=0;  i<number_copy_rev.length()-1; i++)
	{
		if(Character.getNumericValue(number_copy_rev.charAt(i)) <= Character.getNumericValue(number_copy_rev.charAt(i+1)))
			continue;
		else
			descFlag = false;
			break;
	}
	
	if(ascFlag)
	{
//		System.out.println(number_copy.charAt(number_copy.length()-2));
		String output = new StringBuilder(number_copy.substring(0, number_copy.length()-2)).append(number_copy.charAt(number_copy.length()-1)).append(number_copy.charAt(number_copy.length()-2)).toString();
		System.out.println(output);
	}
	else if(descFlag)
	{
		System.out.println("Unpossible");
	}
	else
	{
		int pos;
		String unOrdered = "";
		String properOrder= "";
		int centre = 0;
		ArrayList<Integer> unorder= new ArrayList<Integer>();
		for(int i=0; i<number_copy_rev.length()-1; i++)
		{
			if((int) number_copy_rev.charAt(i) > (int) number_copy_rev.charAt(i+1))
			{
				pos = i+1;
				properOrder = number_copy_rev.substring(i+2, number_copy_rev.length());
				unOrdered = number_copy_rev.substring(0, i+1);
				centre = Character.getNumericValue(number_copy_rev.charAt(i+1));
				
				break;
			}
		}
		int max_number = 9;
		for(int i=0; i<unOrdered.length();i++)
		{
			if((Character.getNumericValue(unOrdered.charAt(i)) > centre) && ((Character.getNumericValue(unOrdered.charAt(i))) < max_number))
			{
				max_number = (Character.getNumericValue(unOrdered.charAt(i)));
			}
			
		}
		int count = 1;
		for(int i=0; i<unOrdered.length();i++)
		{
			
			if((Character.getNumericValue(unOrdered.charAt(i))) == max_number && count ==1)
			{
				count = 0;
				continue;
			}
			
			unorder.add((Character.getNumericValue(unOrdered.charAt(i))));
		}
		unorder.add(centre);
		Collections.sort(unorder);
		StringBuilder output_sp = new StringBuilder(properOrder).reverse().append(max_number);
		for(int item : unorder)
		{
			output_sp.append(item);
		}
		String output = output_sp.toString();
		System.out.println(output);
	}
}
}