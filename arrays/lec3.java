//ASKING USER TO ENTER ELE AND DISP THE SAME 
import java.util.Arrays;
import java.util.Scanner;
public class lec3 
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the size of the ele");
        int n=scan.nextInt();
        int []a= new int[n];
        System.out.println("the array ele enter karo");
        for(int i=0;i<n;i++)
        {
          a[i]=scan.nextInt();
        }
        for(int name: a)
            System.out.println(name);
        
        //System.out.println("the array ele are:");
        //System.out.println(Arrays.toString(a));
    }
}
