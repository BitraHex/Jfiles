//sum using array and loop
import java.util.*;
public class a2{
    public static void main(String[] args) {
    int num[]={5,10,15,20};
    int sum=0;
    for(int i=0;i<num.length;i++)
    {
         sum=sum+num[i];
    }
    System.out.println("sum is"+sum);
    }
}