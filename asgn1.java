// 1.store +ve and -ve elements in two different arrys
import java.util.*;
class asgn1
{
    public static void main(String[] arg)
    {
        int i;
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
            if(a1[i] < 0)
            {
                a2[i] = a1[i];
                a1[i] =0;
            }
        }
        System.out.println("the arry elements are");
        for(i=0; i<n; i++)
        {
            System.out.println(a1[i]);
             
        }
        System.out.println("negative arry");
          for(i=0; i<n; i++)
        {
            System.out.println(a2[i]);
             
      
        }
        
        
    }
        
}
