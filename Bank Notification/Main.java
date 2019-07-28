import java.util.Scanner;
public class Main
{
  
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String bank = in.next();
      int type = in.nextInt();
      Details d = new Details();
      System.out.print(bank+"-");
      
      if(type == 1)
      d.notificationBySms();
      
      else if (type == 2)
      d.notificationByEmail();
      
      else
        d.notificationByCourier();
    }
}
interface Notification
{
 void notificationBySms() ;
 void notificationByEmail();
 void notificationByCourier();
}
class Details implements Notification
{

public void notificationBySms()
{
System.out.print("Notification by SMS");
}
public void notificationByEmail()
{
System.out.print("Notification by Mail");
}
public void notificationByCourier()
{
System.out.print("Notification by Courier");
}
}