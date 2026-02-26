import java.util.Scanner;

public class nestedswitch
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter dept");
        String dept=scan.next();
        System.out.println("enter usn");
        int usn=scan.nextInt();

        switch(dept)
        {
            case "mech" -> System.out.println("mech dept");
            case "aiml" -> System.out.println("aiml");
            case "iot" ->{
                System.out.println("iot dept");
                switch(usn)
                {
                    case 1 -> System.out.println("anil");
                    case 2->System.out.println("arya");
                    case 3->System.out.println("varsha");
                    case 4->System.out.println("balaji");

                }
            } 

        }
    }
}
