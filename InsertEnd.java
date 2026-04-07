import java.util.Arrays;
public class InsertEnd 
{
    public static void main()
    {

    
    int[] a= new int[6];
    int ele=1;
    //int index;
    
    for(int index=0;index<=2;index++)
    {
        a[index]=ele;
        ele++;
    }
   System.out.println(Arrays.toString(a));
     int index=3;
     a[index]=10;
     index++;
    System.out.println(Arrays.toString(a));  

}



}
