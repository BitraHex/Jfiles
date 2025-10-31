import java.util.*;
public class Ternery{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int max=((a>b)?a:b)>c?((a>b)?a:b):c;
        System.out.println(max+"is the maximum");
    }}
