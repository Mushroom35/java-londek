package pl.sda.javalondek4.java_demo.exception;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ExceptionExample {
    // checked exceptions - all inherited from Exception but RuntimeException
    // unchecked exceptions - all inherited from RuntimeException
    // errors - inherited directly from Throwable
    public static void main(String[] args)
    //    throws NoNickException // don't do it!!!
    {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        // handle or declare
        // SOLID??
        String myNick;
        try { // first step
            myNick = exceptionGenerator.nick();
        } catch (NoNickException e) { // second - sometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        } finally { // third // always
            // myNick = "from finally:)"; // it always overrides nick:(
        }
        System.out.println("My nick is: " + myNick);

        System.out.println("Now with runtime exceptions...");
        myNick = exceptionGenerator.nickWithRuntimeException();
        System.out.println("My nick now is: " + myNick);

//        String nullString = null;
//        nullString.concat(" ma kota");
        System.out.println("here???");
    }
}
