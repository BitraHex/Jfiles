//user input array
import java.util.*;
public class a5{
    public static void main(String[]args){
        Scanner sn=new Scanner (System.in);
        System.out.println("Enter the number of elements:");
        int n= sn.nextInt();
        int [] num=new int[n];
        System.out.println("Enter"+n+"numbers:");
        for(int i=0;i<n;i++)
        {
            num[i]=sn.nextInt();
        }
        int l=num[0];
        for(int i=0;i<n;i++)
        {
            if(num[i]>l)
            {
                l=num[i];
            }
        }
        System.out.println("Largest num is:"+l);

    }
}