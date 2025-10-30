//how many even numbers
import java.util.*;
public class a4{
    public static void main(String[]args)
    {
        int[] num={2,5,6,9,10};
        int c=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                c++;
            }
        }
        System.out.println("Num of even numbers:"+c);
    }
}