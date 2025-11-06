class InventoryItem{
    private String  name;
    private int  quantity;
    InventoryItem(String name,int quantity){
        this.name=name;
        this.quantity= Math.max(quantity,0);

    }
     void printInfo(){
System.out.println("name:"+name+"quantity: "+quantity);


    }
void Restock(String name,int ammount){
    if(ammount<0){
        System.out.println("Invalid ammount");
    }
    else{
        System.out.println(name+" "+ammount+" ammount restocked");
    }
printInfo();
}
void sell(String name,int ammount){
    if(ammount<0|| quantity-ammount<=0){
        System.out.println("Insufficient quantity");
    }
    else{
        quantity=quantity-ammount;
        System.out.println(name+" "+ammount+" sold");
    }
    printInfo();
}


}
public class Entask3{
    public static void main(String[] args){
        InventoryItem a=new InventoryItem("pen",10);
        a.printInfo();
        a.Restock("pen",4);
        a.sell("pen",4);




    }

}