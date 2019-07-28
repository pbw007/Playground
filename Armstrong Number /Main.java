import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner in =  new Scanner (System.in);
      int n = in.nextInt();
      int final_compare = n;
      int number_of_digits = 0;
      int armstrong = 0;
      int last_digits = 0;
      int power = 1;
        int result = 1;
      int temp_n = n;
      while(temp_n > 0)
      {
         temp_n = temp_n / 10;
          ++number_of_digits;     
      }

     
      while (n>0)
      {
        last_digits = n %  10;
      
        power = 1;
        result = 1;
        while(power <= number_of_digits)
        {
          result = result * last_digits;

          ++power;
        }
          armstrong = armstrong + result;        


        n = n / 10;
      }
 if(armstrong == final_compare)
 {
   System.out.println("Armstrong Number");
 }
      else
      {
         System.out.println("Not a Armstrong Number");
      }

	}
}