import java.util.*;
public class fact{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("enter any number:");
        int n=sn.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(n+"factiorial is "+fact);
    }

}