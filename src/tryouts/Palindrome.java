package tryouts;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[])
{
	String input = "Ha123ri-ir!!!!ah";
	input = input.toLowerCase();
	Boolean noPalin = false;
	for(int i=0, j=input.length()-1; i<input.length(); i++, j--)
	{
		if(!(input.charAt(i) >='a' && input.charAt(i) <='z'))
		{
			
			System.out.println("I problem");
			j++;
			continue;
		}
			
		if(!(input.charAt(j) >='a' && input.charAt(j) <='z'))
		{
			System.out.println("J problem");
			i--;
			continue;
		}
		if(input.charAt(i) != input.charAt(j))
			{
				noPalin = true;
				break;
			}
		
	}
	if(noPalin)
		System.out.println("Not a Palindrome");
	else
		System.out.println("A Palindrome");
}

}
