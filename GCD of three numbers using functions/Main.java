import java.util.Scanner;
 class Main
 { 
   public static int GCD_of_digits( int n1 , int n2 , int n3 )
   {
     int GCD = 0;
     for( int n = 1 ; n <= n1 ; n++ )
     {
       int div_n1 = n1 % n ;
         int div_n2 = n2 % n ;
       int div_n3 = n3 % n ;
       if( div_n1 == 0 && div_n2 == 0 && div_n3 == 0 )
       {
         GCD = n ;
       }
     }
      return GCD ;
   }
   
 public static void main( String args [] )
 {
     Scanner in = new Scanner (System.in);
     int n1 = in.nextInt();
   int n2 = in.nextInt();
   int n3 = in.nextInt();
      if(n1 > n2)
      {
        int temp = n1;
        n1 = n2;
        n2 = temp;    
      }
   if(n1 > n3)
   {
     int temp = n1;
     n1 = n3;
     n3 = temp;
   }
     int GCD = GCD_of_digits( n1 , n2 , n3 );
     System.out.println(GCD);
     }
 }