// To check whether a number is Armstrong or not
public class Armstrong
{
    public static void main(int n)// Enter a number
    {
        int a,num,s=0;
        num=n;
        while(n>0)
        {
            a=n%10;
            s=s+a*a*a;
            n=n/10;
        }
        if(num==s) System.out.println("The number "+num +" is an Armstrong Number.");
        else
        System.out.println("The number "+num +" is not an Armstrong Number.");
    }
}
