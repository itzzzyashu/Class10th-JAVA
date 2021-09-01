//To find the Greatest Number 
import java.util.*;
public class Greatest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,d,p;
        System.out.println("Enter three Numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=Math.max(a,b);
        p=Math.max(c,d);
        System.out.println("Greatest Number = "+p);
    }
}
