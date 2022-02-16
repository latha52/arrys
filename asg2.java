import java.util.*;
class asg2
{
    public static void main(String arg[])
    {
        int phm,chm,bim,mm,com;
        float t,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter phy,che,bi,maths,com, marks");
        phm = sc.nextInt();
        chm = sc.nextInt();
        bim = sc.nextInt();
        mm = sc.nextInt();
        com = sc.nextInt();
        t = (phm+chm+bim+mm+com);
        t = t/500;
           // System.out.println(t);
        per = t*100;
         System.out.println("percentege :"+per+" "+t);
        if(per>=90)
          System.out.println("garde A");
        else if(per>=80)
               System.out.println("garde B");
            else if(per>=70)
                     System.out.println("garde C");
                else if(per>=60)
                            System.out.println("garde D ");
                    else if(per>=40)
                                System.out.println("garde E");
                            else
                                    System.out.println("Fail F");
    }
}