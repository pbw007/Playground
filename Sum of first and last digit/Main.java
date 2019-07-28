import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  int input = in.nextInt();
  int Last_digit = input % 10;
  while(input>10)
  {
    input=input/10;
  }
  int First_digit = input;
int sum = First_digit + Last_digit;
    System.out.println(sum);
}
}