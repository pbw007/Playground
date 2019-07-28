import java.util.Scanner;
 class Main
 { 
   public static int square_of_digits( int n )
   {
     int n1 = n*n ;     
     return n1 ;
   }
   
 public static void main( String args [] )
 {
     Scanner in = new Scanner (System.in);
     int n = in.nextInt();

     
     int square = square_of_digits( n );
     System.out.print(square);

 }
 }