// A menu driven program to calculate the area of triangles
import java.util.*;
public class Menu
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int c,s,a,b,m,n,p;
    double k, area=0;
    System.out.println("1. Area of an Equilateral Triangle");
    System.out.println("1. Area of an Isosceles Triangle");
    System.out.println("1. Area of an Scalene Triangle");
    System.out.println("Enter your choice");
    c=in.nextInt();
    switch(c)
    {
      case 1:
        System.out.println("Enter side of an Equilateral triangle");
        s=in.nextInt();
        area= (Math.sqrt(3)*s*s)/4.0;
        System.out.println("Area = "+area);
        break;
      case 2:
        System.out.println("Enter side and base of Icoscales triangle");
        a=in.nextInt();
        a=in.nextInt();
        area=b*(Math.sqrt(4*a*a-b*b))/4.0;
        System.out.println("Area = "+area);
        break;
      case 3:
        System.out.println("Enter the sides of Scalene triangle");
        m=in.nextInt();
        n=in.nextInt();
        p=in.nextInt();
        k=(m+n+p)/2.0;
        area=Math.sqrt(k*(k-m)*(k-n)*(k-p));
        System.out.println("Area = "+area);
        break;
      default:
        System.out.println("Wrong Choice!!");
    }
  }
}
