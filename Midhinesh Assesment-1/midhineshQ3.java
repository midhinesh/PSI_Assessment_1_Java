public class midhineshQ3
{
	public static void main(String[] args) 
	{
		boolean[][] test = {{true, false, true},{false, true, false}};
		int r=test.length;
		int c=test[0].length;
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if (test[i][j]) 
				{
					System.out.print(" t ");
				} 
				else 
				{
					System.out.print(" f ");
				}
				
			}
			System.out.println();
		}	
    }
}