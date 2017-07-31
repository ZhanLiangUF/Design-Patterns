public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyWithWings();
  }
  public void display() {
    System.out.print("GOTTA display");
  }
}
