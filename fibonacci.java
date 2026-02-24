import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
  {

    
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the nth position");
    int n= scan.nextInt();

    int a =0;
    int b=1;
    int c;

    for(int i=2;i<=n;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    System.out.println(b);
   }
}
