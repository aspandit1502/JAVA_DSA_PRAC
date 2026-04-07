//yha basically last me ek seat khali hoti hai lekin ele ko shuru me baithna hota hai so we shoft all of them one by one
import java.util.Arrays;

public class InsertStart 
{
    public static void main(String[] args) {
       //int[]a=new int[6];
        int[] a={2,3,4,5,6,0};
    for(int index=4;index>=0;index--)
    {
       a[index+1]=a[index];
    } 
    a[0]=1;
    System.out.println(Arrays.toString(a));
    }
    
}
