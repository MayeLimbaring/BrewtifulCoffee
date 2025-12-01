public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
}
