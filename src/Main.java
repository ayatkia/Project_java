//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        dog.setName("Dog");
        dog.sound();
        duck.fly();
        duck.swim();
        fish.setName("Fish");
        fish.swim();


    }
}