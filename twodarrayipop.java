import java.util.Arrays;
import java.util.Scanner;
public class twodarrayipop 
{
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        int [][]a = new int[3][2];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
               a[i][j]=scan.nextInt();
            }
        }


         for(int[] arr:a)
        {
            System.out.println(Arrays.toString(arr));
        }
   

    }
}
