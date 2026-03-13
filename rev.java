import java.util.Arrays;
import java.util.Scanner;
public class rev 
{
    public static void main(String[] args) 
    {
    Scanner scan=new Scanner(System.in);
    {
       int a[]= new int[3];
       for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        } 

        System.out.println(Arrays.toString(a));


        //2D array
     int arr[][]= new int[3][];
       for(int i=0;i<a.length;i++)
       {
          for(int j=0;j<arr[i].length;j++)

       
        {
            arr[i][j]=scan.nextInt();
        } 

         System.out.println(Arrays.deepToString(arr));


    }
}
}
}
