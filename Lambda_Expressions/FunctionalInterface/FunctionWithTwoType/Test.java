package Lambda_Expressions.FunctionalInterface.FunctionWithTwoType;

/**
 * InnerTest
 */
@FunctionalInterface
interface Function<T,R> {
    //R apply(T s);
    T up(R s);
    
}
public class Test {
    public static void main(String[] args) {

        // Function<String,Integer> lenght = s -> s.length();

        // System.out.print(lenght.apply("Hello"));

        Function<String,String> upCase = s -> s.toUpperCase();
        Function<String,String> upCase2 = String::toUpperCase;
        
        System.out.println(upCase.up("hello"));
        System.out.println(upCase2.up("hello"));
    }
}
