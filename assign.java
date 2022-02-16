import java.util.*;
class assign
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter char value");
        ch = sc.next().charAt(0);
        if(ch>=65&&ch<=91)
            System.out.println("given char is upper case");
        else if(ch>=92&&ch<=106)
            System.out.println("given char is lower case");
        else 
            System.out.println("ur entering the no.");
      //  System.out.println("enter proper input");
    }
}