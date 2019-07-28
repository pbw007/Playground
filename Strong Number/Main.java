import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int fin_compare = num;
    int last_num = 0;
    int fact_prev = 0;
    int fact = 1;
    int sum = 0;
      
      while(num > 0)
      {

        fact_prev = sum;

        last_num = num % 10;
         fact = 1;
          for( int count = 1; count <= last_num; count++)
          {
            
            fact=fact*count;
          }

         sum = fact_prev + fact;
         num = num/10 ;
      }
         if ( sum == fin_compare)
         {
           System.out.println("Yes");
         }
      else
         System.out.println("No");
        
	}
}