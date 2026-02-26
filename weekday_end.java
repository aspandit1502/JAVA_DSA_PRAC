import java.util.Scanner;
public class weekday_end
{
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner (System.in);
        System.out.println("enter the num");
        int num=scan.nextInt();
        switch(num)
        {
            case 1,2,3,4 -> System.out.println("weekdays");
            case 5,6,7 -> System.out.println("weekdays!!!!");
        }
    }
}