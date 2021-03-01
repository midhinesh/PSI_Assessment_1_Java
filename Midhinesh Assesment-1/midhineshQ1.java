import java.util.*;
class midhineshQ1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number:");
		int a= sc.nextInt();
		System.out.println("Input second number:");
		int b= sc.nextInt();
		System.out.println("Input third number:");
		int c= sc.nextInt();
		System.out.println("Input fourth number:");
		int d= sc.nextInt();
		if(a==b&&b==c&&c==d)
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
	}
}