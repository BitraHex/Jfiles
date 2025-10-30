import java.util.*;
public class fibonacci{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=0,b=1,n,c=0;
    System.out.println("Enter any number");
    int n=sc.nextInt();
    for(int i=0;i<=n;i++)
    {
        System.out.println(a+" ");
        c=a+b;
        a=b;
        b=c;
    }
}}