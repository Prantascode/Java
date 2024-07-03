public class StaticPublic {
    static void mystatic(){
        System.out.println("Static Method can be called Without called object");
    }
    public void mypublic(){
        System.out.println("Public method must be  called object");
    }
    public static void main(String[] args) {
        mystatic();

        StaticPublic obj = new StaticPublic();
        obj.mypublic();
    }
}
