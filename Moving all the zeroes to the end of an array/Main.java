import java.util.Scanner;
class Main
{
    
    public static void segregate(int arr [] , int arr1[] , int size)
    
    {
    int zerocount = 0  ;
    
        for(int i = 0, j = 0 ; i < size ; i++)
        {
            if ( arr[i] == 0 )
            {
            zerocount++;
            }
          else
          {
            arr1[j] = arr[i];
            j++;
          }
        }
        for(int i = (size) - zerocount  ; i < size ; i++)
        {
           arr1[i]=0;
        }

      for(int i = 0 ; i < size ; i++)
      {
      System.out.print(arr1[i]);
        System.out.print(" ");
      }
    }
    
    
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    int arr1[] = new int[size];

    for(int i = 0 ; i < size ; i++)
    {
        arr[i]= in.nextInt();
    }
    
    segregate(arr,arr1,size);
  }
}