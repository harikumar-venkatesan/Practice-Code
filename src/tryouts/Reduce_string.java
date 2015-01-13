package tryouts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Reduce_string {

	public Reduce_string() {
		// TODO Auto-generated constructor stub
	}

public static void main(String args[])
{
	String input = "abcabc";
	Set<Character> chars = new HashSet<Character>();
	chars.add('a');
	chars.add('b');
	chars.add('c');
	Boolean flag = true;
	while(flag)
	{
//		System.out.println("While");
		flag = false;
		for(int i=0, j=1; i<input.length()-1; i++, j++)
	{

		if(input.charAt(i) != input.charAt(j))
		{
//			System.out.println(input.charAt(i) + "Enter?" + input.charAt(j));
			flag = true;
			Set<Character> temp = new HashSet<Character>();
			temp.add('a');
			temp.add('b');
			temp.add('c');
			Set<Character> temp_present = new HashSet<Character>();
//			System.out.print(temp.toString());
//			System.out.print(temp_present.toString());
			
			temp_present.add(input.charAt(i));
			temp_present.add(input.charAt(j));
			temp.removeAll(temp_present);
//			System.out.print(temp.toString());
//			System.out.print(temp_present.toString());
			
			Iterator iter = temp.iterator();
			char letter = (char)iter.next();
//			System.out.println(letter + "letter ?");
			input = input.substring(0, i) + letter + input.substring(j+1); 
//			System.out.println(input);
			
 		}
		
	}	
	}
	System.out.println(input);
}
}
