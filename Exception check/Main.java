import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     try {
         int count = Integer.parseInt(br.readLine());
       System.out.print(count);
     } catch(Exception e) {
         System.out.println("Input Mismatch Exception occurred");
     } 
     
   }
}