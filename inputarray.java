import java.util.Arrays;
import java.util.Scanner;
public class inputarray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[]a=new int[5];
        System.out.println("enter the array elements");
        for(int i=0;i<5;i++)
        {
            a[i]=scan.nextInt();
        }
        //System.out.println("the array elemets are");
        //for(int i=0;i<5;i++)
        //{
          // System.out.println(a[i]);
        //}

        System.out.println(Arrays.toString(a));

    }
}
