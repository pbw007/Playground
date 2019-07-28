import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int [size];
      boolean palindrome = true;
      for(int  i = 0 ; i < size ; i++)
      {
        arr[i] = in.nextInt();
      }
      for(int i = 0 ; i < size ; i++)
      {
        if(arr[i] == arr[(size - 1 ) - i ])
        {
          continue;
        }
        else
        {
          palindrome = false;
        }
      }
      if(palindrome == false)
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
    }
}