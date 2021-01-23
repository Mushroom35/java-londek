package pl.sda.javalondek4.java_demo.exception;

import java.util.Random;

public class ExceptionGenerator {


    public String nick() throws NoNickCheckedExemption {
        Random random = new Random();
        if (random.nextInt(100) % 2== 0) {
            return "grzybek";
        } else {
            throw new NoNickCheckedExemption("I have no nick... Yet :P");
        }
    }

    public String nickv2() {
        String myNick;
        try { // first step
            myNick = nick();
        } catch (NoNickCheckedExemption e) { // second - sometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        } finally { // third // always
            // myNick = "from finally:)"; // it always overrides nick:(
        }
        return myNick;
    }

    /**
     * @throws NoNickCheckedExemption
     * @return
     */
    public String nickWithRuntimeException() {
        Random random = new Random();
        if (random.nextInt(100) % 2== 0) {
            return "grzybek";
        } else {
            throw new NoNickRuntimeExc("I have no nick... Yet :P");
        }
    }
}
