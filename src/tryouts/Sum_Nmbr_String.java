package tryouts;


public class Sum_Nmbr_String {

	public Sum_Nmbr_String() {
		// TODO Auto-generated constructor stub
	}

	
public static void main(String args[])
{
	String nmbr_pattern = "[0-9]";
	String alpha_pattern = "[^0-9]";
	String input = "hello9-4 ha8ri";
	
	String letter_only = input.replaceAll(nmbr_pattern, "");
	String nmbr_only = input.replaceAll(alpha_pattern, "");
	letter_only = letter_only.replaceAll(" ","");
	
	int sum = 0;
	for(char s : nmbr_only.toCharArray())
	{
		sum += Character.getNumericValue(s);
	}
	//System.out.print(letter_only.length());
	
	System.out.println((int)Math.ceil(sum/(float)letter_only.length()));
}
}
