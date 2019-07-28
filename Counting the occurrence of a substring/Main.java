import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        
        int n = 0;
           for(int i=0 ; i < len1 ; i++)
           {
               int m = 0;
               int i_store = i;
               for(int j = 0 ; j < len2 ;j++ )
               {
                   if(i >= len1)
                   {
                       break;
                   }
                   char z1 = str1.charAt(i);
                   char z2 = str2.charAt(j);
                   if(z2 == z1)
                   {
                       i++;
                       m++;
                   }
                   if(z2 != z1)
                   {
                       break;
                   }
                   if(m == len2)
                   {
                       n++;
                       m=0;
                   }
           
                }
                i=i_store;
            }
            System.out.print(n);
    }
}








