public class ClassAttributes {
    int x = 5;

    public static void main(String[] args) {
        ClassAttributes obj1 = new ClassAttributes();
        ClassAttributes obj2 = new ClassAttributes();
        obj2.x = 25;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
