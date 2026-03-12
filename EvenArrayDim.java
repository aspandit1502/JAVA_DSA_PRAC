import java.util.Arrays;
public class EvenArrayDim
{
    public static void main(String[] args)
    {
        int [][] a= {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
       System.out.println("the array elements are:");
       System.out.println(Arrays.deepToString(a));

       for(int row=0;row<a.length;row++)
       {
        for(int col=0;col<a[row].length;col++)
        {
            if(a[row][col]%2==0)
            {
                System.out.print(a[row][col]+ " ");
            }

        }
        System.out.println();
       }
    }
}
