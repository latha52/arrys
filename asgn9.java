//   prime number in arry elements

import java.util.*;
class asgn3
{
    public static void main(String[] arg)
    {
        int i,co=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. elements in an arry ");
        int n = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[n];
        System.out.println("enter arry elements ");
        for( i=0; i<n; i++)
        {
            a1[i] = sc.nextInt();
        }
        
            
        for(i=0; i<n; i++)
        {
            
            if(a1[i]%i == 0)
            {
                co++;
            
            }
            if(co == 2)
            {
                a2[i] = a1[i];
            }
    
        }
        
          for(i=0; i<n; i++)
        {
            
            System.out.println("prime elements "+a2[i]);
        }
            
    }
}
