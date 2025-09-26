public class Eagle extends Animal implements Flyable{
    public Eagle(String name, int age) {

        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " låter aaaaahhhh");

    }
    @Override
    public void eat(){
        System.out.println("Örnen " + getName() + " äter kött");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " flyger");
    }
}

