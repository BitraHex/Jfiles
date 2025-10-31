import java.util.*;
class area{
    double radius;
    double breadth,width;
    int hight,base;
    area(double radius){
        this.radius=radius;
        System.out.println("area of a triangle is:"+ Math.PI*radius*radius);
}
area(double breadth,double width){
    this.breadth=breadth;
    this.width=width;
    System.out.println("area of a rectangle is"+ breadth*width);
}
area(int hight,int base){
    this.base=base;
    this.hight=hight;
System.out.println("area of a triangle is:"+0.5*base*hight);
}
}
public class LabTask2{
    public static void main(String[] args){
        System.out.println("choose option:1.circle 2.rectangle 3.triangle");
        Scanner sc=new Scanner (System.in);
        int n=nextInt();
        switch(n){
            case 1:
                System.out.println("enter the radius");
                double radius=sc.nextDouble();
                new area(radius);
                break;
                case 2:
                System.out.println("enter the breadth& width");
                double breadth=sc.nextDouble();
                 double width =sc.nextDouble();
                new area(breadth,width);
                break;
                case 3:
                System.out.println("enter the base and hight");
                int base=sc.nextInt();
                int hight=sc.nextInt();
                new area(base,hight);
                break;
        }
    }
}