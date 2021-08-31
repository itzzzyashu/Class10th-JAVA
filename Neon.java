// To Check wheather a number is Neon or not
public class Neon
{
  public static void main(String args[])
  {
    int p,s=0,d;
    p=n*n;
    do
    {
      d=p%10;
      s=s+d;
      p=p/10;
    }
    while(p!=0);
    if(s==n)
      System.out.println("It is a Neon Number");
    else
      System.out.println("It's not a Neon Number");
  }
}
