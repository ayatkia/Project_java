public class Dog  extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println(getName()+ " is ho ho ho");
    }
}
