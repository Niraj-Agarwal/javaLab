import java.util.*;
public class PossibleSquare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		if(n<0)
		{
		    System.out.println("invalid");
		}
		else
		{
		    while(n!=0)
		    {
		        sum=sum+ n*n;
		        n--;
		    }
		    System.out.println("result="+sum);
		}
		
	}
}
