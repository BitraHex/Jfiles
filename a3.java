//largest number
import java.util.*;
public class a3{
    public static void main(String[] args) {
        int[] num={3,9,2,14,7};
        int l=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>l)
            {
                l=num[i];
            }
        }
        System.out.println("largest is:"+l);
    }
}