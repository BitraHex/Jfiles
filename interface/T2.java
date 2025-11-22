interface isEmergency{
    void soundSiren();
}
class fireEmergency implements isEmergency{
public void soundSiren(){
    System.out.println("Siren Sounded");
}
}
class SmokeAlarm{

}
public class T2{
    public static void main(String[] args){
        Object[] myArray=new Object[4];
        myArray[0]=new SmokeAlarm();
        myArray[1]=new SmokeAlarm();
        myArray[2]=new fireEmergency();
        myArray[3]=new fireEmergency();

      for(int i=0;i<=myArray.length;i++)
      {
        if(myArray[i]instanceof fireEmergency){
            System.out.println("Emergency at index"+i+":");
            ((fireEmergency)myArray[i]).soundSiren();
        }
        else{
            System.out.println("index"+i+"is not an emergency");
        }
      }  
    }
}