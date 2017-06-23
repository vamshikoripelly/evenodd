import java.util.Scanner;

public class evenodd {
	public static void main(String args[])
	{
		int n;
		Scanner j=new Scanner(System.in);
		System.out.println("Even & Odds between 1 and");
		int t=Integer.parseInt(j.nextLine());
		j.close();
		System.out.println("All evens :");
		for(n=1;n<=t;n++)
		{
			if(n%2==0)
			{
				System.out.print(" "+n);
			}
		}
		System.out.println("\n All Odds :");
		for(n=1;n<=t;n++)
		{
			if(n%2!=0)
			{
				System.out.print(" "+n);
			}
		}
	}

}
