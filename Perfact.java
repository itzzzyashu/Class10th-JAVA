// To Check whether a number is perfact or not
import java.util.*;
public class Perfact
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in):
    int a,n,s=0;
    System.out.ptintln("Enter a Number");
    n=in.nextInt();
    for(a=1;a<n;a++)
    {
      if(n%a==0)
        s=s+a;
    }
    if(s==n)
      System.out.println(a+ " is a perfact number.");
    else
      System.out.println(a+ " is not a perfact number");
  }
}
