// To find the sum of all positive even and negetive odd numbers as per user's choice.
import java.util.*;
public class Choice
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in)
      int n,s1=0,s2=0;
    System.out.println("Enter a Number or zero to Quit");
    n=in.nextInt();
      while(n!=0)
      {
        if(n>0 && n%2==0)
          s1=s1+n;
        if(n<0 && n%2!=0)
          s2=s2+n;
        System.out.println("Do you want to continue?");
        System.out.prinln("Enter a number to continue or zero to quit");
        n=in.nextInt();
      }
    System.out.println("The sum of positive even numbers = "+s1);
    System.out.println("The sum of negetive odd numbers = "+s2);
  }
}
