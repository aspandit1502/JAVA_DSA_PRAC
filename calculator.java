import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner (System.in);
      while(true)
        {
            System.out.println("enter the operator");
            char op=scan.next().trim().charAt(0);
            if(op=='x'|| op=='X')
            {
                System.out.println("exiting");   
                break;
            }
            if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%')
            {
                System.out.println("enter the two numbers to calculate");
                int a=scan.nextInt();
                int b=scan.nextInt();
                switch (op) 
                {
                    case '+':
                        System.out.println(a+b);
                        break;

                     case '-':
                        System.out.println(a-b);
                        break;

                     case '*':
                        System.out.println(a*b);
                        break;

                     case '/':
                        System.out.println(a/b);
                        break;

                     case '%':
                        System.out.println(a%b);
                        break;
                }
            
                    

            }
            else
            {
                System.out.println("invalid operator!!");
            }
        }  
    }
}

