import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 10 numbers:");
        int s=99999;
        int ssm=s;
        int a[]=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=sc.nextInt();
            
        }
        for (int i = 0; i < 10; i++) {
            if(a[i]<s)
            {
                ssm=s;
                s=a[i];
            }
            else if(a[i]<ssm && a[i]!=s)
            {
                ssm=a[i];
            }
            
        }
        System.out.print("Second smallest num:"+ssm);
    }
}