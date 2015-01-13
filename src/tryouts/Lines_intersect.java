package tryouts;

public class Lines_intersect {

	public Lines_intersect() {
		// TODO Auto-generated constructor stub
	}

public static void processStart(String input[])
{
	double m[] = new double[2], c[] =  new double[2];
	for(int i=0; i<3; i+=2)
	{
		String coordinates1 [] = input[i].split(",");
		String coordinates2 [] = input[i+1].split(",");
		
		
		m[i/2] = (Float.parseFloat(coordinates2[1].substring(0, coordinates2[1].length()-1)) - Float.parseFloat(coordinates1[1].substring(0,coordinates1[1].length()-1)))/ (Float.parseFloat(coordinates2[0].substring(1)) - Float.parseFloat(coordinates1[0].substring(1)));
		c[i/2] = (Float.parseFloat(coordinates2[1].substring(0, coordinates2[1].length()-1))) - m[i/2] * (Float.parseFloat(coordinates2[0].substring(1)));
	
	}
	findSol(m,c);
}
public static void findSol(double m[], double c[])
{
	if(m[0] == m[1])
	{
		if(c[0] == c[1])
		{
			System.out.println("Same Lines");
		}
		else
			System.out.println("Parallel Lines");
	}
	else
	{
		double x = (c[1]-c[0]) / (m[0]-m[1]);
		double y1 = x*m[0] + c[0];
		double y2 = x*m[1] + c[1];
		
		System.out.println("X is "+ x);
		System.out.println("y is "+ y1+" "+ y2);
	}
}
	public static void main(String args[])
	{
		String input[] = {"(1,2)","(3,4)","(1,2)","(3,4)"};
		processStart(input);
	}
}
