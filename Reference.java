class Reference
{
  public void demoRef(int a[])
  {
    for (int i = 0; i < 5; i++)
    {
      a[i] = i;
    }
  }
  public static void main(String args[])
  {
    Reference obj = new Reference();
    int arr[] = { 10, 20, 30, 40, 50 };
    System.out.println("Before call to demoRef value of arr");
    for (int i = 0; i < 5; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    obj.demoRef(arr);
    System.out.println("After call to demoRef value of arr");
    for (int i = 0; i < 5; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
