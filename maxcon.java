import java.util.Scanner;
public class maxcon 
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       int a[]= new int[6];
       int cs=0, max=0;
       System.out.println("enter the array ele");
       for(int m=0;m<a.length;m++)
        {
            a[m]=scan.nextInt();
        } 
      for(int i=0;i<a.length;i++)
      {
        if(a[i]==1)
        {
            cs++;
            //max++;
            if(cs>max)
            {
                max=cs;
            }
        }

        else
        {
            cs=0;
        }
      }
      System.out.println("the max consecutive no of 1's in your array is: "+ max);
    }
}
