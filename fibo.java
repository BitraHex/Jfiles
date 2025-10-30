import java.util.*;
public class fibo
{
    public static void main(String[]args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("enter any num:");
        int n=sn.nextInt();
        int a=0;int b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" " );
            
            int next=a+b;
            a=b;
            b=next;
        }    }
}