interface A{
    void methodA();
}
interface B{
    void methodB();
}
interface C extends A,B{
void methodC();
}
class D implements C{
    public void methodA(){
        System.out.println("Method A from interface a");
    }
     public void methodB(){
        System.out.println("Method A from interface B");
    }
     public void methodC(){
        System.out.println("Method A from interface C");
    }
}
public class T1{
    public static void main(String[] args) {
        D obj= new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }}
