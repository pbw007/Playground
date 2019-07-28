import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0 ; i < size ; i++)
    {
        arr[i] = in.nextInt();
    }
    for(int i = 0 ; i < size ; i++)
    {
        int j_prev = 0;
        for(int j = i+1 ; j < size ; j++)
        {
        
            if(arr[i] < arr[j] && arr[j] > j_prev )
            {
                System.out.println(arr[i]+","+arr[j]);
                j_prev = arr[j];
            }
            
        }
            
    }
  }
}