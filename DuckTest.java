package patos;

public class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck, redHead, decoyDuck, rubberDuck;

        mallardDuck = new MallardDuck();
        mallardDuck.showDuck();

        redHead = new RedHeadDuck();
        redHead.showDuck();

        decoyDuck = new DecoyDuck();
        decoyDuck.showDuck();

        rubberDuck = new RubberDuck();
        rubberDuck.showDuck();
    }
}

