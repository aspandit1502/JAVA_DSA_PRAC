public class reverse
{
    public static void main(String[] args)
    {
        int rem,rev=0;
        int n=12345;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            //System.out.print(rem);
            n=n/10;
        }   
        System.out.println(rev);     
    }
}
