import java.util.*;

public class Main
{

  public static void main (String[]args)
  {

    int n, i, j, k = 1, m = 1, l = 1;

    Scanner in = new Scanner (System.in);

      n = in.nextInt ();

    for (i = 1; i <= n; i++)
      {

	             if (i % 2 == 0)
	  {

	             int rev = l + k - 1;

	             for (j = 1; j <= m; j++)
      {

		if (j % 2 == 0)
       {
	
		         System.out.print ("*");

  		        }

	                           else  {

	   	     System.out.print ("" + rev--);

	   	     k++;
		  
		     } }

	                   }
	
	                   else
  	  {

	                 for (j = 1; j <= m; j++)

	                   {
		
		if (j % 2 == 0)	  {

		    System.out.print ("*");

		  }
		
		else   {
 
		    System.out.print ("" + k);

		    k++;
		 
 		} }
	
	   }

	System.out.println ();
	
	m = m + 2;
		
	l++;
   
          }



  }
}
