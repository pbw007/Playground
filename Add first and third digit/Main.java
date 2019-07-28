import java.util.Scanner;
class Main{
  
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int p = in.nextInt();
 
      int x = p/100;
      int y = p%10;
      int z = x + y;
      System.out.println(z);
	}
}