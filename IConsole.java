package javaapplication2;

import java.util.Scanner;

// Interface
interface IConsole {

    String getConsoleType();

    String getStore();

    int getTotalSales();
}

// Abstract class
abstract class ConsoleDevice {

    // Variables
    protected String consoleType;
    protected String store;
    protected int totalSales;

    // Constructor
    public ConsoleDevice(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Get console type
    public String getConsoleType() {
        return consoleType;
    }

    // Get store
    public String getStore() {
        return store;
    }

    // Get total sales
    public int getTotalSales() {
        return totalSales;
    }
}

// Console class
class Console extends ConsoleDevice implements IConsole {

    // Constructor
    public Console(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Display console options
        System.out.println("Select the console type:");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Determine console type
        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                System.out.println("Invalid console choice.");
                scanner.close();
                return;
        }

        // Enter store name
        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        // Enter total sales
        System.out.print("Enter the total sales of "
                + consoleType + " consoles for "
                + store + ": ");
        int totalSales = scanner.nextInt();

        // Create Console object
        Console console = new Console(consoleType, store, totalSales);

        // Display report
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println();

        System.out.println("Console Type: " + console.getConsoleType());
        System.out.println("Store: " + console.getStore());
        System.out.println("Total Sales: " + console.getTotalSales());

        scanner.close();
    }
}


