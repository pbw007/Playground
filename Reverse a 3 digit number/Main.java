import java.util.Scanner;
class Main{
  
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int z = x/10;
      int a = z/10;
      int b = z%10;

      int c = (b*10)+a;
    
      int y = (x%10)*100+c;
       
      System.out.println(y);
      
        
	}
}