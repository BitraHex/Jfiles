
import javax.naming.InsufficientResourcesException;

class inSufficientException extends Exception{
    public inSufficientException(String message){
        super(message);
    }
}
public class BankAccount{
private double balance=5000;
void withdrawl(double ammount) throws inSufficientException{
    if(ammount>balance){
        throw new inSufficientException("Not Enough Balance!");
    }
    balance-=ammount;
    System.err.println("Withdrawal Sucessful.bBalance:"+balance);
}
public static void main(String[] args){
    try {
        BankAccount ac= new BankAccount();
        ac.withdrawl(500);
    } catch (inSufficientException e) {
System.err.println(e.getMessage());
    }
}
}