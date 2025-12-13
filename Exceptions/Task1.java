import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
public class Task1{
    public static void  main(String[] args){
    try {
        int sum=10/0;
        System.out.println("Division is :"+sum);
    } catch (ArithmeticException e) {
        System.out.println("Unchecked exception:"+e.getMessage());
    }
    try {
        FileReader fr=new FileReader("data.txt");
    } catch (FileNotFoundException e) {
        System.out.println("Checked exception:"+e.getMessage());
    }
    }
}