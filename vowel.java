import java.util.*;

public class vowel
{
public static void main(String[]args)
 {
Scanner sn= new Scanner(System.in);
System.out.println("enter a letter:");
char ch=sn.next().charAt(0);
char c=Character.toLowerCase(ch);
if(c=='a'||c=='e'||c=='i'||c=='o' || c=='u')
 {
    System.out.println("vowel"+ch);
 }
 else if (c>='a'&& c<='z')
 {
    System.out.println("consonant"+ch);
 }
else 
{

     System.out.println("invalid input");
}
 }

}