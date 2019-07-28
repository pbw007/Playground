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
    int search_ele1 = in.nextInt();
    int search_ele2 = in.nextInt();
    
    int occurance1 = 0;
    int occurance2 = 0;
    for(int i = 0 ; i < size ; i ++ )
    {
      if (marks[i] == search_ele1)
      {
          occurance1 = 1;
        System.out.println(i);
      }
      if (marks[i] == search_ele2)
      {
          occurance2 = 1;
        System.out.println(i);
      }
      
    }        
      if(occurance1 == 0 )
      {
       System.out.println("-1");
      }
       if(occurance2 == 0 )
      {
       System.out.println("-1");
      }
      
    
    
    
    
    
    
  }
}