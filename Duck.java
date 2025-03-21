package patos;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        } else {
            System.out.println("No flying behavior defined.");
        }
    }

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        } else {
            System.out.println("No quacking behavior defined.");
        }
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void showDuck() {
        display();
        performFly();
        performQuack();
        swim();
    }
}