package tryouts;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicate {

	public Remove_duplicate() {
		// TODO Auto-generated constructor stub
	}
public static int check_dup(int array[])
{
	Set <Integer> unique = new HashSet<Integer>();
	for(int i=0; i<array.length;i++)
	{
		unique.add(array[i]);
	}
	return -unique.size()+array.length;
}
	
	public static void main(String args[])
	{
		int array [] = {1,2,2,3,3,3,4,5};
		System.out.println(check_dup(array));
	}
}
