import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  int input = in.nextInt();
  int num = 0;
  while(input>=99)
  {
     input=input/10;  
  }
  int Second_number=input%10;
  System.out.println(Second_number);

}
}