package it.unibo;

public class Squirrel implements Animal {
    
    private Diet diet = new Omnivore();

    @Override
    public double averageWeight() {
       return 5.0;
    }

    @Override
    public boolean canEatVegetables() {
        return diet.canEatVegetables();
    }

    @Override
    public boolean canEat(Animal a) {
        return this.averageWeight() > a.averageWeight();
    }
}
