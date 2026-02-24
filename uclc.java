import java.util.Scanner;

public class uclc
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner (System.in);
        char ch=scan.next().charAt(0);

        if(ch>='a' && ch <='z')
        {
            System.out.println("Lower case letter");
        }

        else if(ch>='A' && ch<='Z')
        {
             System.out.println("Upper case letter");

        }

        else
        {
            System.out.println("invalid ");

        }
    }
    
}
