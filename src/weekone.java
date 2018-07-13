import java.util.Scanner;

public class weekone {

    public static void main (String[] args) {

        Scanner planner = new Scanner (System.in);

        String itemName01, itemName02;
        Double itemPrice01, itemPrice02;
        int itemQuantity01, itemQuantity02;

        System.out.println("Enter name of your first item: ");
        itemName01 = planner.next();

        System.out.println("Whats the price? ");
        itemPrice01 = planner.nextDouble();

        System.out.println("How many do you have? ");
        itemQuantity01 = planner.nextInt();

        System.out.println("Enter name of your second item: ");
        itemName02 = planner.next();

        System.out.println("Whats the price? ");
        itemPrice02 = planner.nextDouble();

        System.out.println("How many do you have? ");
        itemQuantity02 = planner.nextInt();

        double Cost1 = itemPrice01 + itemQuantity01;
        double Cost2 = itemPrice02 + itemQuantity02;

        System.out.println("Item Name       Price      Quantity     Cost");

        System.out.println(itemName01 + "       $" + itemPrice01 + "        " + itemQuantity01 + "      " + Cost1);


        System.out.println(itemName02 + "       $" + itemPrice02 + "        " + itemQuantity02 + "      " + Cost2);


        System.out.println( "Total purchase amount: $" + ( Cost1 + Cost2));

        if (Cost1 + Cost2 > 20) {
            System.out.println( "You spent too much today");
        }

        System.out.println("Thank you for shopping at my market!");
    }

}
