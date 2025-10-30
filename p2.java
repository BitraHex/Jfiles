import java.util.*;
public class p2{
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        System.out.println("Enter any letter:");
        char ch=sn.next().charAt(0);
        char c=Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {System.out.println(c+ "is a vowel");}
        else if(c>='a'&&c<='z')
        {System.out.println(c+ "is consonant");}
        else{System.out.println("invalid input");}
    }
}