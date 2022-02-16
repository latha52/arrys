import java.util.*;
class asg3
{
    public static void main(String arg[])
    {
        float bs;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic salary");
        bs = sc.nextFloat();
        if(bs<=10000)
          System.out.println("hra is 20%,da is 80%");
        else if(bs<=20000)
               System.out.println("hra is25%,da is 90%");
            else 
                 System.out.println("hra is 30%,da is 95%");
                
    }
}