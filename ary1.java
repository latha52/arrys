import java.util.*;
class ary1
{
    public static void main(String[] arg)
    {
        int i,n,sum = 0;
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter n value");
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("enter arry elements");
        for(i=0 ; i<= n-1; i++)
        {
            
            ar[i] = sc.nextInt();
        }
        System.out.println("arry elements are");
        for(i=0 ; i<= n-1; i++)
        {
            System.out.print("\t"+ar[i]);
        }
        for(i=0 ; i<= n-1; i++)
        {
            sum = sum+ar[i];
        }
        System.out.println("sum os arry elements is:"+sum);
    }
}