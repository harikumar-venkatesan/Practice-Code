package tryouts;

public class Longest_Inc_Sequence {
	static int array[] = {1,5,3,4,3,6};
	static int size = 100;
	static int memLoc[] = new int[size];
	static int prev[] = new int[6];
	public Longest_Inc_Sequence() {
		// TODO Auto-generated constructor stub
	}

	public static void LCS_compute()
	{
		memLoc[0] = 1;
		for(int i=1; i<size;i++)
		{
			memLoc[i] = -1;
		}
		System.out.println(array.length+"length");
		for(int i=1; i<array.length;i++)
		{
			prev[i] = -1;
			LCS(i);
		}
	}
	public static int LCS(int start)
	{
		int lcs = 0;
		for(int i=0; i<start; i++)
		{
			if(array[i] < array[start])
			{
				int lcs_1 = Math.max(lcs, memLoc[i]+1);
				if(lcs_1!=lcs)
				{
					prev[start] = i+1;
				}
				lcs = lcs_1;
			}
		}
		memLoc[start] = lcs;
		
		return lcs;
	}
public static void main(String args[])
{
	
	LCS_compute();
	int max = 0;
	for(int i=0; i<size-1;i++)
	{
		max = Math.max(max, memLoc[i]);
	}
	System.out.println(max);
	for(int i : prev)
	{
		System.out.print(array[i]);
	}
}
}
