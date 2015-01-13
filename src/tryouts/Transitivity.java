package tryouts;

public class Transitivity {

	public Transitivity() {
		// TODO Auto-generated constructor stub
	}

public static void main(String args[])
{
	int array[][] = {{0,1,0,0}, {0,0,1,0},{0,0,1,1},{0,0,0,1}};
	int size = 4;
	Boolean Transitive = true;
	for(int i=0; i<size; i++)
	{
		for(int j=0;j<size;j++)
		{
			if(true)
			{
				if(array[i][j] == 1)
				{
					for(int k=0;k<size;k++)
					{
						if(array[j][k] ==1 && array[i][k] !=1)
						{
							Transitive = false;
							System.out.println(i+"-"+k);
							array[i][k] = 1;
						}
					}
				}
			}
		}
	}
	System.out.println(Transitive);
}
}
