package it.unibo;

public class Carnivore implements Diet {
    public boolean canEatVegetables() {
        return false;
    }
    public boolean canEatMeat() {
        return true;
    }
}
