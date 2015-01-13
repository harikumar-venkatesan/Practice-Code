package tryouts;

public class Bracket_match {

	public Bracket_match() {
		// TODO Auto-generated constructor stub
	}

public static void main(String args[])
{
	String input = "((hariku()mar))";
	int count = 0;
	for(char s : input.toCharArray())
	{
		if(s == '(')
		{
			count ++;
		}
		if(s == ')')
		{
			count --;
		}
	}
	if(count == 0)
	{
		System.out.println("Success");
	}
	else
		System.out.println("Failure");
}
}
