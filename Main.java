public class Main {
    public static void main(String[] args) {

        Coffee myCoffee = new BlackCoffee(); // base coffee
        System.out.println(myCoffee.getDescription() + " - ₱" + myCoffee.getCost());

        // Adding Milk
        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.getDescription() + " - ₱" + myCoffee.getCost());

        // Adding Caramel Syrup
        myCoffee = new CaramelSyrup(myCoffee);
        System.out.println(myCoffee.getDescription() + " - ₱" + myCoffee.getCost());

        // You can keep wrapping more decorators
    }
}
