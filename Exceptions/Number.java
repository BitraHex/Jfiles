import java.util.*;
public class Number{
    public static void main(String[] args) {
      try {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a num:");
          String input=sc.nextLine();
int n=Integer.parseInt(input);
System.out.println("You Entered:"+n);

      } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      }
    }}
