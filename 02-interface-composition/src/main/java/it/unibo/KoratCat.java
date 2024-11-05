package it.unibo;

public class KoratCat implements Animal {

    private Diet diet = new Carnivore();

    @Override
    public double averageWeight() {
       return 10.0;
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
