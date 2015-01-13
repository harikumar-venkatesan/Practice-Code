package tryouts;

public class Shortestpath_dp {

	static int size = 4;
	static int visited[] = new int[size];
	static int memLoc[] = new int[size];
	public Shortestpath_dp() {
		// TODO Auto-generated constructor stub
	}

public static int shortestPath_cal(int matrix[][], int start, int destination)
{

	for(int i=0; i<size;i++)
	{
		memLoc[i] = -1;
	}
	return shortestpath(matrix, start, destination);
}

public static int shortestpath(int matrix[][], int destination, int start)
{
	System.out.println(start+"start"+destination+"dest");
	if(start == destination)
		{
			System.out.println("reached");
			return 0;
		}
	else if(memLoc[start] != -1)
	{
		System.out.println("already computed");
		return memLoc[start];
	}
	
	else if(visited[start] ==1)
		{
			System.out.println("Visited");
			return 0;
		}
	
	else
	{
		int shpath = 1000;
		visited[start] = 1;
		for(int i=0;i<size;i++)
		{
			if(matrix[start][i] ==1)
			{
				System.out.println(i+" i "+ destination);
				shpath = Math.min(shpath, 1 + shortestpath(matrix, destination, i));
				System.out.println(shpath+"shortest at that point "+i+" " +destination);
				
			}
		}
		memLoc[start] = shpath;
		System.out.println("memLoc assigned");
		return shpath;
	}
}
	
	public static void main(String args[])
	{
		int matrix [][] = {{1,1,0,0}, {1,1,1,1},{0,1,1,1},{0,1,1,1}};
		
		System.out.println(shortestPath_cal(matrix,0,3));
	}
}
