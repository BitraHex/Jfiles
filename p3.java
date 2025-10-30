import java.util.*;
public class p3{
    public static void main(String[]args)
    {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter a string:");
        String ch=sn.nextLine();
        int c=0;
        try {
            while(true)
            {
                ch.charAt(c);
                c++;

            }
        } catch (Exception e) {
        }
System.out.println("number of char is:"+c);
    }
