package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("Playing with calc lambdas");

        Adder<Integer> adder = (Integer a,Integer b) -> {
            return a + b;
        };
        Adder<Integer>adder2 = (first, second) -> {
            return first + second;
        };
        Adder<Integer> adder3 = (first, second) -> first + second;

        StrangeOne strangeOne = (int a, int b) -> {
            return a + b;
        };
        StringAdder stringAdder = ((one, two) -> {
            return one.concat(two);
        });

        MyAdder myAdder = (a, b, comment) -> {
            System.out.println(comment);
            return a + b;
        };

        Substraction<Integer> substraction = (a, b) -> a - b;
        Multiplication<Integer> multiplication = (a, b) -> a * b;
        Division<Double> div = (a, b) -> a / b;

        myAdder.addWithComment(5, 10, "should be 15");

        Operation<Double> divisionOperation = (first, second) -> first/second;
        Operation<Double> divisionOperation2 = (first, second) -> first*second;

    }

}
