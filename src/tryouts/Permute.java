package tryouts;

public class Permute {

	public Permute() {
		// TODO Auto-generated constructor stub
	}
	
	public static void permute(String input)
	{
		permutation("", input);
	}
	
	public static void permutation(String done_permute, String yet_permute)
	{
		int length = yet_permute.length();
		if(length == 1)
		{
			System.out.println(done_permute+yet_permute);
		}
		else
		{
			for(int i=0; i<length; i++)
			{
				permutation(done_permute+yet_permute.charAt(i), yet_permute.substring(0,i)+yet_permute.substring(i+1));
			}
		}
	}
public static void main(String args[])
{
	String input = "hai";
	
	permute(input);
}
}
