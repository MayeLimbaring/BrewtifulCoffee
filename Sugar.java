public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 10.00; // Price of sugar
    }
}
