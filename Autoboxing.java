// a sample perogram to illustrate Autoboxing and Unboxing
class Autoboxing
{
  public static void main(String args[])
  {
    int x=25,y;
    Integer val = new Integer(x); // Autoboxing
    y=val; // Unboxing
    System.out.println("Values after Autoboxing\t"+val);
    System.out.println("Values after Unboxing\t"+y);
  }
}
