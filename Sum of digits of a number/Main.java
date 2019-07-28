import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  int input = in.nextInt();
  int num = 0;
  while(input>0)
  {
    int n1 = input%10;
    num = num + n1;
    input=input/10;
    
  }
  System.out.println(num);

}
}
