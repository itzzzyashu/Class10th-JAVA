// To Calculate discount on ticket
import java.util.*;
public class Ticket
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    {
      int i,p;
      double d=0,amt=0;
      String name;
      for(i=1;i<=15;i++)
      {
        System.out.println("Enter the name of customer : ");
        name=in.nextLine();
        System.out.println("Enter the amount of the ticket : ");
        p=in.nextInt();
        if(p<25001)
          d=p*2.0/100.0;
        if(p>25001&&p<=35000)
          d=p*10.0/100.0;
        if(p>35001&&p<=55000)
          d=p*12.0/100.0;
        if(p>55001&&p<=70000)
          d=p*16.0/100.0;
        if(p>70000)
          d=p*18.0/100.0;
        amt=(p-d);
        System.out.println("SI.No. | Name | Ticket Charge | Discount | Net Amount");
        System.out.println(i+" | "+name+" | "+p+" | "+d+" | "+amt);
      }
    }
  }
}
