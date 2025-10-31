class student{
    int id;
    String name;
    student(String name,int id){
        this.name=name;
        this.id=id;
    }
     void display(){
        System.out.println(name + " " +id+" ");

    }
}
public class parametricConstructors{
    public static void main(String[] args)
{
    student s1=new student("ayrin",242);
    student s2= new student("meem",234);
    s1.display();
    s2.display();
}}