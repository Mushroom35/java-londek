package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        ManiekRunner maniekRunner = new ManiekRunner();
        maniekRunner.walk();
        Runner runner = new ManiekRunner();
        handleRunner(runner);

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner");
            }
        };
        handleRunner(anonymousRunner);

        // call handleRunner user anonymous class
        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }
        });

        //using lambda - supper happy :)
        handleRunner(() -> System.out.println("inside lambda call"));

        //we're implemetning method go() here!!!
        Runner myFirstLambda = () -> {
        };
        //expression has value, statement not (void)
        Runner mySecondLambda = () -> {
            System.out.println("Inside my second lambda");
        };
        Runner myThirdLambda = () -> System.out.println("my third lambda");

        Runner myFourthLambda = () -> {
            System.out.println("first text");
            System.out.println("second text");
        };
        myFourthLambda.go();
        myFourthLambda.go(4);
        Runner.walk();
    }

    public static void handleRunner(Runner anyRunner) {
        System.out.println("handleRunner()");

        anyRunner.go();
    }

}
