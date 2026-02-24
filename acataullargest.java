import java.util.Scanner;
public class acataullargest 
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int a= scan.nextInt();
         System.out.println("A="+a);
         int b=scan.nextInt();
         System.out.println("B="+b);
         int c=scan.nextInt();
         System.out.println("C="+c);
        int max=a;

        if(b>max)
        {
            max=b;
        }

        else if(c>max)
        {
             max=c;
        }

    
       System.out.println(max);
        
        

    }
}

