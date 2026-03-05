public class swap_value
{
    public static void main(String[] args )
    {
        int a=45; int b=90;
        swap(a,b);
    }
     
    static void swap(int a, int b)
    {
        
        System.out.println("before swap:\n a= " + a + "b= "+ b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap:\n a= " + a + "b= "+ b);
    }
}
