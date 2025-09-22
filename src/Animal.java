public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound(){}

    public void eat(){
        System.out.println(getName()+ " is eating...");
    }
}
