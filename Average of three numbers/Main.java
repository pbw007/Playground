import java.util.Scanner;
class Main{
  
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
      int a = x+y+z;
      int avg= a/3;
      System.out.println(avg);
	}
}