import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int [size];
    int mid = size/2;
    for(int i = 0 ; i < size ; i++)
    {
      arr[i] = in.nextInt();
    }
    for(int i = 1 ; i < mid ; i++)
    {
      for(int j = 0 ; j < i ; j++)
      {
        if(arr[j] > arr[i])
        {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
       for(int i = 0 ; i < size ; i++)
    {
       System.out.print(arr[i]);
         System.out.print(" ");
    }
  }
}