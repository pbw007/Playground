import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
        primeNum(n1);	    
	}
    
	public static void primeNum(int n1)
	{
      int i, number, count; 
      for(number = 1; number <= n1; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.println(number);
		    }  
		}
	}
} 
