public class Dog extends Animal {

    public Dog(String name, int age) {

        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " låter voff!!");

    }

    @Override
    public void eat() {
        System.out.println("Hunden " + getName() + " äter hundmat och en o annan köttbullemacka");

    }
}
