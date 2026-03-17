package OOPs.Methods_Overloading;

class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Demo {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int rlt = cal.add(5, 6);
        int rlt1 = cal.add(5, 6, 7);
        System.out.println(rlt);
        System.out.println(rlt1);
    }
}
