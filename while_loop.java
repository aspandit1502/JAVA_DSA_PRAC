import java.util.Scanner;
public class while_loop 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter last dig");
        int num =scan.nextInt();
        int i=1;
        while( i<=num)
        {
            System.out.println(i);
            i++;
        }
    }
}





/*public class while_loop 
{
    public static void main(String args[])
    {
      //  Scanner scan=new Scanner(System.in);
        //System.out.println("enter last dig");
        // num =scan.nextInt();
        int i=1;
        while( i<=5) 
        {
            System.out.println(i);
            i++;
        }
    }
}
*/