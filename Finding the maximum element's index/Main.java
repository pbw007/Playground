import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    
    int marks[] = new int[size]; 
    for(int i = 0 ; i < size ; i ++)
    {
      marks[i] = in.nextInt(); 
    }
   int max=0;
    int index=0;
   
    for(int i = 0 ; i < size;i ++ )
    {
    if( marks[i] > max )
    {
      max = marks[i];
      index = i;
    }
    }
    System.out.print(index);


}
}