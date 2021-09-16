package exercise10;


import java.text.DecimalFormat;
import java.util.Scanner;



class Taxes {

    private static DecimalFormat df = new DecimalFormat("0.00");

    double cost1;
    double cost2;
    double cost3;
    double quantity1;
    double quantity2;
    double quantity3;

    public void scn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of item 1: ");
        this.cost1 = sc.nextDouble();
        System.out.print("Enter the amount of item 1: ");
        this.quantity1 = sc.nextDouble();

        System.out.print("Enter the cost of item 2: ");
        this.cost2 = sc.nextDouble();
        System.out.print("Enter the amount of item 2: ");
        this.quantity2 = sc.nextDouble();

        System.out.print("Enter the cost of item 3: ");
        this.cost3 = sc.nextDouble();
        System.out.print("Enter the amount of item 3: ");
        this.quantity3 = sc.nextDouble();
    }

    public void prt() {

        double subTotal = (cost1 * quantity1) + (quantity2 * cost2) + (cost3 * quantity3);
        double tax = (subTotal * 5.5) / 100;
        double finalTotal = subTotal + tax;

        System.out.println("Subtotal: $" + df.format(subTotal));
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + df.format(finalTotal));
    }


}
public class solution10 {


    public static void main(String[] args) {
        Taxes ca = new Taxes();
        ca.scn();
        ca.prt();
    }
}

/* real tears came out of my eyes having to redo all of these, but i must admit,
 they look a lot nice to read. the first thing this code does import both the
 scanner function and the decimal format function to round the dollar to the
 nearest cent. after that, a class named class is created and then the first
 instance of the decimal format function is made. then the quantity and cost of
 the items are declared as doubles.two public void are then made, "scn" which
 reads in the values from the user, and "prt" which does the actual math and
 prints out the final solutions. the math for the subtotal is calculated by
 adding together the price of the items multiplied by the amount of items. all
 of the answers for the subtotal, base total, and final total are all formatted
 using the decimal format function to ensure they are all rounded to the closest
 cent. finally, the main function calls these two voids to run the program.
 */