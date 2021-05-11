import java.util.*;

public class TotalPrice
{
	public static void main (String [ ] args) 
	{
		Scanner x = new Scanner (System.in);
		System.out.println ("Enter number of item:");
		int n = x.nextInt ();
		int [ ] totalitem = new int [n];
		int totalPrice = 0;
		for (int i=0; i<n; i++)
		{
		System.out.print ("Enter price for item:");
		totalitem [i] = x.nextInt ();
		totalPrice = totalPrice + totalitem [i]; 
		}
	System.out.println ("TOTAL:" + totalPrice); 
	}
}
