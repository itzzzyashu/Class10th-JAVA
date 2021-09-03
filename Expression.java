// To find the value of the given expression by using command line arguement
public class Expression
{
  public static void main(String args[])
  {
    int a,b;
    double p;
    /** The Values of a and b are intered through arguement in String form */
    a = Integer.parse.Int(args[0]);
    b = Integer.parse.Int(args[1]);
    p = (double)(a*a+b*b)/(a-b);
    System.out.println("The value of the expression = "+p);
  }
}
