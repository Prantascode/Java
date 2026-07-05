package Lambda_Expressions.ParameterBased;

interface Multiple{
    public int multi(int x);

}
public class SingleParameter {
    public static void main(String[] args) {
        Multiple m = (x) -> x * x;
           
        System.out.println(m.multi(5));
    }
}
