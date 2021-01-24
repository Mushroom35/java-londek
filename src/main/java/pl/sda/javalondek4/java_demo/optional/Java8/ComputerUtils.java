package pl.sda.javalondek4.java_demo.optional.Java8;

public class ComputerUtils {

    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }

    public static String getGraphicCardModelGoodApproach(Computer computer) {
        return null;
    }

    public static void main(String[] args) {
        Computer nullComputer = null;
        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 3080"));


        getGraphicCardModelGoodApproach(withoutGraphicsCard);
        getGraphicCardModelGoodApproach(withUnknownModel);
        getGraphicCardModelGoodApproach(personalComputer);
        getGraphicCardModelGoodApproach(nullComputer);
    }
}
