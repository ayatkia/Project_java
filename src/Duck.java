public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.print("Duck flying...");
    }

    @Override
    public void swim() {
        System.out.print("Duck swimming...");

    }
}
