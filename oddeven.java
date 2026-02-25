import java.util.Scanner;

public class oddeven 
{
    public static void main(String[] args)
     {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int a=scan.nextInt();
        if(a%2==0)
        {
          System.out.println("entered numer "+a+" is even" );
        }
        else
        {
          System.out.println("entered numer "+a+" is odd" );
        }
    }
}
