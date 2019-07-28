import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
        int n2 = in.nextInt();
        
	    System.out.print(powNum(n1,n2)); 
	}
    
	public static int powNum(int n1 , int n2)
	{
	  int pow = 1;
      for(int n = 1 ; n <= n2 ; n++)
      {
         pow = pow * n1; 
      }
      
	    return pow;
	}
} 
