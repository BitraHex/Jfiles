import java.util.*;
public class Stringin
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("enter a string:");
        String s=sn.nextLine();
        System.out.println(" entered string is :"+s ); //ayrin rahman
   //System.out.println(s.length());//12
    System.out.println(s.charAt(0));//a
     System.out.println(s.charAt(6));//r
      System.out.println(s.substring(2,9));//rin rah
     int c=0;
    char a[]=s.toCharArray();
    while(c<a.length)
    {
        c++;
    } 
   System.out.println("lenth of the string is :"+c);
   
   
   
    }
}