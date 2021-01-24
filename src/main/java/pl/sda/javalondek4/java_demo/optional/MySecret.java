package pl.sda.javalondek4.java_demo.optional;

import pl.sda.javalondek4.java_demo.lambda.calculator.MyAdder;

import static java.util.Objects.nonNull;

public class MySecret {
    private String secret;

    public MySecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret realOne = new MySecret("I like learning JVM technologies :P");
        MySecret withNullContent = new MySecret(null);
        printSecretLenght(realOne);
        printSecretLenght(withNullContent);
    }

    public static void printSecretLenght(MySecret mySecret) {
        int secretLen = mySecret.getSecret() != null ? mySecret.getSecret().length() : 0;
        secretLen = nonNull(mySecret.getSecret()) ? mySecret.getSecret().length() :0;
//        the same functionality
//        if (mySecret.getSecret() != null) {
//            secretLen = mySecret.getSecret().length();
//        } else {
//            secretLen = 0;
//        }
        System.out.println("My secret has " + secretLen + " characters");
    }

}
