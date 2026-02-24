import java.util.Scanner;
public class largest3 
{
    public static void main(String args[])
    {
         Scanner scan=new Scanner(System.in);
         {

        
         System.out.println("enter the three numbers for comparision");
         int a= scan.nextInt();
         System.out.println("A="+a);
         int b=scan.nextInt();
         System.out.println("B="+b);
         int c=scan.nextInt();
         System.out.println("C="+c);


         if(a>b && a>c)
         {
            System.out.println("A is the greatest");
         }
         else if(b>a && b>c)
         {
            System.out.println("B is the greatest");
         }
         else
         {
            System.out.println("C is the greatest");

         }
        }
    }
}
