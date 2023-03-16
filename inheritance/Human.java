// Superclass, subclass, and extending
public class Human extends Mammal{

// Constructors
    public String name;

    public Human(String name) {
        super();
        this.name = name;
        System.out.println("***Subclass constructor***");
    }

    public Human(String name, int age) {
        super(age);
        this.name = name;
        System.out.println("***Subclass constructor***");
    }

    public Human(String name, int age, String location) {
        super(age, location);
        this.name = name;
        System.out.println("***Subclass constructor***");
    }

    public void goToWork() {
        System.out.println("I'm going to work, something only humans can do.");
    }

// Overriding Method
    public void startSleeping() {
        System.out.println("Toss and turn");
        super.startSleeping();
    }
}

