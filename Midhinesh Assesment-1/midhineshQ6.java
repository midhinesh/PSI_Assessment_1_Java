import java.util.*;
public class midhineshQ6
{		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        		System.out.print("Input first number: ");
        		int n=sc.nextInt();
				int z=0;
    			String bin=Integer.toBinaryString(n);
				System.out.print("Binary representation of "+n+" is:"+bin);
    			for (char c: bin.toCharArray())
				{
      				z += c == '0'?1:0;
				}
				System.out.println("\nNumber of zero bits: "+z);
	}
}