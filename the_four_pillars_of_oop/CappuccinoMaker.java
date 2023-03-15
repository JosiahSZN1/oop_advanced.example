// Inheritance
class CappuccinoMaker extends CoffeeMaker {
    
    public CappuccinoMaker(int maxVolumeOz) {
        super(maxVolumeOz);
        this.milk = "whole";
    }
    
    public void makeCappuccino(String beans) {
        super.brew(beans);
        System.out.println("Smooth.");
    }

// Polymorphism
    public CappuccinoMaker() {
        this.maxVolumeOz = 16;
        this.milk = "whole";
    }
                
    public void brew(String beans) {
	super.brew(beans);
        System.out.println("Frothy!!!");
    }
                
    public void clean(){
        System.out.println("Cleaning the froth!");
    }
}

