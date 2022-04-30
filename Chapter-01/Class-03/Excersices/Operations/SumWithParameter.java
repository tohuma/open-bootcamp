package Operations;

public class SumWithParameter 
{
	public static double sum(double n1, double n2, double n3)
	{
		return(n1 + n2 + n3);
	}
	
	
	public static void main(String[] args)
	{
		double total = sum(5, 10, 15);
		
		System.out.println( total );
	}
}
