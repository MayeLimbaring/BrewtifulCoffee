import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee myCoffee = null;

        // --- Step 1: Choose base coffee ---
        System.out.println("Welcome to Brewtiful Coffee!");
        System.out.println("Choose a base coffee:");
        System.out.println("1. Black Coffee (₱100)");
        System.out.println("2. Espresso (₱120)");

        int baseChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch(baseChoice) {
            case 1:
                myCoffee = new BlackCoffee();
                break;
            case 2:
                myCoffee = new Espresso();
                break;
            default:
                System.out.println("Invalid choice, defaulting to Black Coffee.");
                myCoffee = new BlackCoffee();
        }

        // --- Step 2: Add toppings (here is your while loop) ---
        boolean addingToppings = true;

        while (addingToppings) {
            System.out.println("\nChoose an addition (0 to finish):");
            System.out.println("1. Milk (₱25)");
            System.out.println("2. Caramel Syrup (₱40)");
            System.out.println("3. Whipped Cream (₱30)");
            System.out.println("4. Sugar (₱10)");

            int toppingChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (toppingChoice) {
                case 0:
                    addingToppings = false;
                    break;
                case 1:
                    myCoffee = new Milk(myCoffee);
                    break;
                case 2:
                    myCoffee = new CaramelSyrup(myCoffee);
                    break;
                case 3:
                    myCoffee = new WhippedCream(myCoffee);
                    break;
                case 4:
                    myCoffee = new Sugar(myCoffee);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        // --- Step 3: Show final order ---
        System.out.println("\nYour order: " + myCoffee.getDescription());
        System.out.println("Total cost: ₱" + myCoffee.getCost());

        scanner.close();
    }
}
