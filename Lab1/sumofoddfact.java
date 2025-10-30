import java.util.*;
public class sumofoddfact{
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    int fact=1,sum=0,i,n;
    System.out.println("Enter any nnumber:");
    n=sc.nextInt();
    for(i=0;i<=n;i++)
    {
        fact=fact*i;
        if(i%2!=0){
            sum=sum+fact;
        }
    }  
    System.out.println(n+"Sum of factorial odd number "+sum);
}
}