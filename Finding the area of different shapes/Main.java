import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int shape = in.nextInt();
      
        switch(shape){
          case 1 :
            int side = in.nextInt();
            System.out.print(side * side);
            break;
            
           case 2 :
            int length = in.nextInt();
            int breadth = in.nextInt();
            System.out.print(length * breadth);
            break;
            
           case 3 :
            int base = in.nextInt();
            int height = in.nextInt();
            int area = ( (base * height)/2);
            System.out.print(area);
            break;
            
           case 4 :
            int radious = in.nextInt();
            System.out.print(3.14 * radious * radious);
            break;
        }
      
    }
}