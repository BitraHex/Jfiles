import  java.util.*;
public class prime{
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int c=0;
    System.out.println("Enter any number");
    int num= sc.nextInt();
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        {
            c++;
            break;
        }
    }
if(c==0)
{
    System.out.println(num+"The num is prime");
}
else{
    System.out.println(num+"The num is not prime");
}
}}