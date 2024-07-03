public class Main {
    public void fullthrottle(){
        System.out.println("This car going as fast as it can.");
    }
    public void speed(int speed){
        System.out.println("Max speed is : " +speed);
    }
}
class Sceond{
    public static void main(String[] args) {
        Main mycar = new Main();
        mycar.fullthrottle();
        mycar.speed(200);
    }
}
