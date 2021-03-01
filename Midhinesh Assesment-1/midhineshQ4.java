public class midhineshQ4
{
	public static void main(String[] args) 
	{
		int[][] d2 = {{10,20,30},{40,50,60}};
		System.out.print("Original Array:\n");
		print_array(d2);
		System.out.print("After changing the rows and columns of the said array:\n");
		transpose(d2);
	}
	private static void transpose(int[][] d2) 
	{
		int[][] nd2=new int[d2[0].length][d2.length];
		for (int i=0;i<d2.length;i++) 
		{
			for (int j=0;j<d2[0].length;j++) 
			{
				nd2[j][i]=d2[i][j];
			}
		}
		print_array(nd2);
	}
	private static void print_array(int[][] d2) 
	{
		for (int i=0;i<d2.length;i++)
		{
			for (int j=0;j<d2[0].length;j++)
			{
				System.out.print(d2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
