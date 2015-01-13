package tryouts;

public class Free_time {

	public Free_time() {
		// TODO Auto-generated constructor stub
	}

	public static String edit_input(String input)
	{
		StringBuilder str = new StringBuilder();
		String split[] = input.split(",");
		for(int i=0; i<split.length; i++)
		{
			String spilt_split [] = split[i].split("-");
			str.append(split_split[0]);
		}
	}
	
public static void main(String args[])
{
	String time = "";
	time = time.replaceAll(":", "");
	time = edit_input(time);
}
}
