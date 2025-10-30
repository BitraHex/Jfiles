import java.util.*;
class circle{
    public static void area(double r){
        System.out.println("area of the circle is "+Math.PI*r*r);

    }
    public static void perimeter(double r)
    {
        System.out.println("Perimeter of circle is:"+ Math.PI*2*r*r);
    }
}
 class triangle{
    public static void area(double l,double b){
        System.out.println("Area of a Triangle is:"+0.5*l*b);

    }
    public static void perimeter(double a,double b,double c){
      double peri=a+b+c;
        System.out.println("perimter of a triangle is:"+ peri);

    }
}
public class areaandperimeter{
    public static void main(String[]args)
    {
        circle.area(4.5);
        circle.perimeter(4.5);
        triangle.area(2.4,5.3);
        triangle.perimeter(2.1,3.2,5.2);
    }
}