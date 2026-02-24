public class palindrome
 {
    public static void main(String[] args) 
    {
       int n=123321;
       int rem,rev=0;
       int temp=n;
       
       while(n>0)
       {
         rem=n%10;
         rev=(rev*10)+rem;
         n=n/10;
       }
       if(temp==rev)
       {
        System.out.println("yes!");
       }
       else{
        System.out.println("not pal :(");
       }
    }
}
