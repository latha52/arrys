// sum of even and odd numbers  arry elements

import java.util.*;
class asgn4
{
    public static void main(String[] arg)
    {
        int i,suev=0,suod=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. elements in an arry ");
        int n = sc.nextInt();
        int a1[] = new int[n];
        
        System.out.println("enter arry elements ");
        for( i=0; i<n; i++)
        {
            a1[i] = sc.nextInt();
        }
        
        for(i=0; i<n; i++)
        {
            if(a1[i]%2 == 0)
            
                    suev = suev+a1[i];
            
            else
                 suod = suod+a1[i];
        }
        
            System.out.println("even number sum is "+" "+suev+ "odd numbers sum is "+" "+suod);
    }
}
