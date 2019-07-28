import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int [size];
      int arr1[] = new int [size];
      for(int  i = 0 ; i < size ; i++)
      {
        arr[i] = in.nextInt();
      }
     for(int  i = 0 ; i < size ; i++)
      {
        int z = arr[i];
       arr1[z-1] = z ;
      }
      for(int  i = 0 ; i < size ; i++)
      {
       if(arr1[i] == 0)
       {
         System.out.print(i+1);
       }
      }
      
    }
}