import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price of one item: ");
        double unitPrice = input.nextDouble();

        if (quantity < 0 || unitPrice < 0) {
            System.out.println("Quantity and price cannot be negative.");
        } else {
            double totalCost = quantity * unitPrice;

            System.out.println("\n=== Cost Summary ===");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Unit price: " + unitPrice);
            System.out.println("Total cost: " + totalCost);
        }

        input.close();
    }
}
