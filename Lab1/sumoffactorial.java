import java.util.*;
public class sumoffactorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1,sum=0,i,n;
        n=sc.nextInt();
        System.out.println("Enter a num:");
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            sum=sum+i;
        }
        System.out.println(n+"fact is "+fact);
        System.out.println(n+"sum of fact is "+sum);
    }
}