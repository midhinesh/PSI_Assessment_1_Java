import java.util.*;
public class midhineshQ5
{
	public static void main(String[] args) 
    	{
        		Integer a[]=new Integer[]{1,4,17,7,25,3,100};
        		int c=3;
				System.out.println("Original Array: ");
				System.out.println(Arrays.toString(a));
				System.out.println(c+" largest elements of the said array are:");
       			Arrays.sort(a, Collections.reverseOrder());         
       			for (int i=0;i<c;i++)
				{ 
          			System.out.print(a[i]+" ");
				}
      	}      
}