package tryouts;

public class Sequence {

	public Sequence() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[])
{
	String number =  "12778";
	int count = 1;
	StringBuilder str = new StringBuilder();
	for(int i=0; i<number.length()-1;i++)
	{
		if(number.charAt(i) == number.charAt(i+1))
		{
			count ++;
		}
		else
		{
			str.append(count);
			str.append(number.charAt(i));
			count = 1;
		}
	}
	if(number.charAt(number.length()-2) == number.charAt(number.length()-1))
		{
			str.append(count);
			str.append(number.charAt(number.length()-1));			
	
		}
	else
	{
		str.append(number.charAt(number.length()-1));
		str.append(1);
	}
	System.out.println(str.toString());
}
}
