import java.util.*;
public class allodd{
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sn.nextInt();
        System.out.println("odd numbers are:");
        for(int i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" " );
            }
        }
    }
}