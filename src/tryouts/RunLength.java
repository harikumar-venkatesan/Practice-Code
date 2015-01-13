package tryouts;

public class RunLength {

	public RunLength() {
		// TODO Auto-generated constructor stub
	}

	public static String length(String str)
	{
		String str_final= "";
		int count = 0;
		
		for(int i=0; i<str.length()-1; i++)
		{
			count++;
//			System.out.println(str.charAt(i));
			if(str.charAt(i+1) == str.charAt(i))
			{
				continue;
			}
			else
			{
				str_final = str_final+count+str.charAt(i);
				count = 0;
			}
		}
		if(str.charAt(str.length()-1) == str.charAt(str.length()-1))
			count ++;
		str_final = str_final+count+str.charAt(str.length()-1);

		return str_final;
	}
	public static void main(String[] args) {
		RunLength run = new RunLength();
		System.out.println(run.length("aabbcdaa"));
	}
}