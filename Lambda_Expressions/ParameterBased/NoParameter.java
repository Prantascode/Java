package Lambda_Expressions.ParameterBased;

@FunctionalInterface
interface Music {
    void run();
}

public class NoParameter{
    public static void main(String[] args) {
        Music s = () -> System.out.println("Running...");
        s.run();
    }
}
