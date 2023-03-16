// Superclass, subclass, and extending
class HumanTest {
    public static void main(String[] args) {
// Constructors
        Human h = new Human("Jeff", 25, "New York");
        System.out.println("Hi, my name is " + h.name);
        System.out.println("I am "+h.age+" years old, and I am from "+h.location);
        h.regulateTemperature();
        h.startSleeping();
        h.goToWork();
        boolean sleeping = h.isSleeping();
        
        if (sleeping){
            System.out.println("The human is sleeping!");
        }
    }
}

