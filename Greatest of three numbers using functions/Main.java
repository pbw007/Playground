import java.util.Scanner;
 class Main
 { 
   public static int Greatest_of_digits( int n1 , int n2 , int n3)
   {
     int G1 = 0 , G2 = n3 ; 
     if(n1>n2)
       G1 = n1 ;    
     else
       G1 = n2;
     if(G1 > G2)
       return G1;
     else
       return G2;
    
   }
   
 public static void main( String args [] )
 {
     Scanner in = new Scanner (System.in);
     int n1 = in.nextInt();
   int n2 = in.nextInt();
   int n3 = in.nextInt();
      
     int Greatest = Greatest_of_digits( n1 , n2 , n3);
     System.out.println(Greatest);
     }
 }
 