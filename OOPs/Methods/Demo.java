package OOPs.Methods;

class Computer{
    public void playMusic(){
        System.out.println("Music Playing....");
    }
    public String giveMeAPen(int cost){
        if (cost >= 5) {
             return "Pen";
        }
        return "Nothing";   
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();
        String str = com.giveMeAPen(2);
        System.out.println(str);

    }
}
