package exercise10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class solution10 {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Enter the cost of item 1: ");
        double cost1 = sc.nextDouble();

        System.out.print("Enter the amount of item 1: ");
        int quantity1 = sc.nextInt();

        System.out.print("Enter the cost of item 2: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter the amount of item 2: ");
        int cost2 = sc.nextInt();

        System.out.print("Enter the cost of item 3: ");
        double cost3 = sc.nextDouble();

        System.out.print("Enter the amount of item 3: ");
        int quantity3 = sc.nextInt();

        double subTotal = (cost1*quantity1)+(price2*cost2)+(cost3*quantity3);

        double tax = (subTotal*5.5)/100;

        double finalTotal = subTotal+tax;

        System.out.println("Subtotal: $"+ df.format(subTotal));
        System.out.println("Tax: $"+ df.format(tax));
        System.out.println("Total: $"+ df.format(finalTotal));
    }
}
/* psuedocode: first we import the scanner function and then create an instance of it. the
same thing is done with the decimal format function so that the final answers can be rounded
to the nearest cent. after that there are a series of scan functions used to read in the
quantity of items and their respective costs. the quantity is stored in an int because all
the numbers are whole numbers, and the prices are held in double floats to help in the end
to find the final total down to the cents. next, the subtotal is calculated by multiplying
the cost of the items by the quantity and then adding them all together. then, the tax is found
by multiplying the subtotal by 5.5 and then dividing by 100. finally, the final total is
calculated by adding the subtotal and the tax. the code prints out the subtotal, the tax,
and the final total separately. all of these are formatted to the nearest cent using the
decimal format function.
 */