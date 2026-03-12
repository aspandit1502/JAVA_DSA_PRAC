import java.util.Arrays;
public class evenarray
{
    public static void main(String[] args)
    {
        int[] a={2,5,8,11,14};
        System.out.println("array elements are:");
      
            System.out.println(Arrays.toString(a));
       
        System.out.println("even array elements are:");
        for(int i=0;i<a.length;i++)
        {
           if(a[i]%2==0)
           {
             System.out.println(a[i]);
           }
        }
    }
}