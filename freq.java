import java.util.Scanner;

public class freq 
{
    public static void main(String[] args) 
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the main number"); 
       int n=scan.nextInt();
       System.out.println("enter the finding  number"); 
       int num=scan.nextInt();
       int count=0;
       while(n>0)
       {
        int rem=n%10;
        if(rem==num)
        {
           count ++;
        }
        n=n/10;
       } 
       System.out.println("the occurance of the number is "+ count +" times");

    }
}
