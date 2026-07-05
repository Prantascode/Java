package Lambda_Expressions.FunctionalInterface.Predicate;

/**
 * Even
 */
@FunctionalInterface
interface Predicate<T> {
    boolean test(T num);     /* A functional interface contains exactly one abstract method, but it can have multiple default and static methods. */
    default void Message(){
       System.out.println("Message....");;
    }
    
}
public class Test {
    public static void main(String[] args) {
        Predicate<Double> obj = num -> num % 2 == 0;
        System.out.println(obj.test(6.0));
        obj.Message();
   }
}
