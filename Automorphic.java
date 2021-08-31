// To check Automorpic number
import java.util.*;
class Automorphic
{
  public static void main(String args[])
  {
    int p,f=0;
    p=num*num;
    do
    {
      if(num%10!=p%10)
      {
        f=1;
        break;
      }
      else 
      {
      num=num/10;
      p=p/10;
      }
    }
    while(num>0);
    if(f==0)
      System.out.println("It is an Automorphic Number");
    else
      System.out.println("It's not an Automorphic Number")
  }
}
