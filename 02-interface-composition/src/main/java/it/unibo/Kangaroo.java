package it.unibo;

public class Kangaroo implements Animal {

    private Diet diet = new Herbivore();

    @Override
    public double averageWeight() {
       return 55.0;
    }

    @Override
    public boolean canEatVegetables() {
        return diet.canEatVegetables();
    }

    @Override
    public boolean canEat(Animal a) {
        return diet.canEatMeat() && (this.averageWeight() > a.averageWeight());
    }
}
