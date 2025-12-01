public class WhippedCream extends CoffeeDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 30.00;
    }
}
