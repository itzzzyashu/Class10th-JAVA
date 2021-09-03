// To display the given pattern Pg-130
public class numpattern
{
  public static void main(String args[])
  {
    int i,j,k,p=0;
    System.out.println("The Pattern :");
    for(i=5;i>=1;i--)
    {
    for(k=1;k<=p;k++)
      System.out.println(" "); // To print a blank.
    for(j=i;j>=i;j--)
      System.out.println(j);
    System.out.println();
    p=p+1;
  }
}
}
