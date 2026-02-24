import java.util.Scanner;
public class dowhile
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter last dig");
        int num =scan.nextInt();
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }        while( i<=num);

    }
}