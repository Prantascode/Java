package Lambda_Expressions.LambdaExpression;

@FunctionalInterface
interface Calculator {
    
    int calculator(int a, int b);

}
class Main1{
    public static void main(String[] args) {
        Calculator cal = ( a,  b) -> a + b;

        System.out.println(cal.calculator(5, 5));
    }
}
