//To calculate the distance between the two points 
import java.util.*;
public class Distance
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int x1,y1,x2,y2;
        double p,d; System.out.println("Enter the value of co-ordinates x1,y1,x2,y2");
        x1=in.nextInt();
        y1=in.nextInt();
        x2=in.nextInt();
        y2=in.nextInt();
        p=Math.pow((y2-y1),2)+Math.pow((x2-x1),2);
        d=Math.sqrt(p);
        System.out.println("The Distance between two points="+d);
    }
}
