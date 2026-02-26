import java.util.Scanner;

public class day_name
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter day number");
        int n=scan.nextInt();
        switch(n)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("thu");
            case 5 -> System.out.println("fri");
            case 6 -> System.out.println("sat");
            case 7 -> System.out.println("sun");
            default -> System.out.println("please enter no btw 1-7");
        }
    }
}
