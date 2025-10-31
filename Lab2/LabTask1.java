class area{
    double radius;
    double breadth,width:
    int base,height;
    area(double radius){
this.radius=radius;

    System.out.println("Area of a circle is:"+ 2*Math.PI*radius);


    }
    area(double breadth,double width){
        this.breadth=breadth;
        this.width=width;
        System.out.println("Area of ractengle is " + breadth*width);
    }
    area(int b,int h){
        this.b=base;
        this.h=height;
        System.out.println("Area of the Triangle is " + 0.5*b*h);
    }
}
public class LabTask1{
    public static void main(String[] args) {
        area a=new area(2.3);
        area b=new area(2.4,3.5);
        area c=new area(2,3);
        
    }}
