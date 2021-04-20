package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck - cluck!";
    }

    @Override
    public String howToEat() {
        // TODO Auto-generated method stub
        return "Could be fried";
    }
    
}
