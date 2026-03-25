import java.util.Scanner;
public class EvenDig
{
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        int a[]= new int[6];
        int eno=0;
        int dig=0;
        int currno;
        System.out.println("enter the array ele");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }

        for(int m=0;m<a.length;m++)
        {
           
           currno=a[m];
           while(currno!=0)
           {
             currno/=10;
             dig++;
           }
           if(dig%2==0)
           {
             eno++;
           }
           dig=0;
        }
       System.out.println(eno);  
  }
}
