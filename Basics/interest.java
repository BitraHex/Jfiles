import java.util.*;
public class interest{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        double p,t,r,A,C,SI;
        System.out.println("Enter principle ammount p:");
        p=sc.nextDouble();
        System.out.println("Enter rate of interest R:");
        r=sc.nextDouble();
        System.out.println("Enter time in year t:");
        t=sc.nextDouble();
        SI=(p*r*t)/100;
        A=p*Math.pow(1+r/100,t);
        CI=A-p;
        System.out.println("Simple interest is "+SI);
        System.out.println("Compound interest "+CI);
    }
}