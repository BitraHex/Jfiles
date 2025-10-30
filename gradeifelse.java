import java.util.*;
public class grade
{
public static void main(String[]args)
{
Scanner g=new Scanner(System.in);
System.out.println("enter your marks:");
int marks=g.nextInt();
if(marks <=100 && marks>=80)
 {
    System.out.println("A+");
 }
else if(marks <=79 && marks>=70)
 {
    System.out.println("A");
 }
else if(marks <=69 && marks>=60)
 {
    System.out.println("A-");
 }
 else if(marks <=59 && marks>=50)
 {
    System.out.println("B");
 }
else if(marks <=49 &&  marks>=40)
 {
    System.out.println("B-");
 }
else if(marks <=39&& marks>=33)
 {
    System.out.println("C");
 }
else if(marks <=32 &&marks>=0)
 {
    System.out.println("f");
 }
 else 
 {
    System.out.println("invalid input");
 }
}}