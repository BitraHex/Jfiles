import java.util.*;
public class grade
{
public static void main(String[]args)
{
Scanner g=new Scanner(System.in);
System.out.println("enter your marks:");
int marks=g.nextInt();
switch(marks/10)
 {case 10:
case 9:
    System.out.println("A+");
    break;
case 8:
    System.out.println("A");
    break;
    case 7:
    System.out.println("A-");
    break;
    case 6:
    System.out.println("B+");
    break;
    case 5:
    System.out.println("B-");
    break;
    case 4:
    System.out.println("C");
    break;
    case 3:
        case 2:
            case 1:
                case 0:
                    System.out.println("F");
                    break;
    default:
        System.out.println("invalid input");

 }


}

}