import java.util.Scanner;

// =====================================================
// STEP 1: INTERFACE CONTRACT SPECIFICATION 
// =====================================================
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// =====================================================
// STEP 2: ABSTRACT SUPERCLASS DEFINITION 
// =====================================================
abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSalesAmount;

    // Parameterized parent constructor
    public Consoles(String consoleType, String storeName, int totalSalesAmount) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSalesAmount = totalSalesAmount;
    }

    // Encapsulation accessor getter implementations
    @Override
    public String getConsoleType() { return consoleType; }

    @Override
    public String getStore() { return storeName; }

    @Override
    public int getTotalSales() { return totalSalesAmount; }
}

// =====================================================
// STEP 3: CONCRETE EXTENDED SUBCLASS 
// =====================================================
class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String storeName, int totalSalesAmount) {
        super(consoleType, storeName, totalSalesAmount); // Mandatory first line execution
    }

    // Custom presentation method required by the rubric section
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("*********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

// =====================================================
// STEP 4: SEPARATE RUN APPLICATION SETUP ENGINE
// =====================================================
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedType = "";

        // Interactive interactive selection menu mimicking the console sheet layout
        System.out.println("Select the beverage type"); // Retaining literal question string format
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear memory buffer newline character

        if (choice == 1) selectedType = "PS5";
        else if (choice == 2) selectedType = "XBOX";
        else if (choice == 3) selectedType = "SWITCH";
        else selectedType = "UNKNOWN";

        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        System.out.print("Enter the total sales of " + selectedType + " consoles for " + store + ": ");
        int sales = scanner.nextInt();

        // Safe defensive code bounds check validation
        assert sales >= 0 : "State Error: Value footprint mismatch bounds constraint.";

        // Instantiate concrete reporting subobject
        ConsoleSales audit = new ConsoleSales(selectedType, store, sales);
        audit.printReport();

        scanner.close();
    }
}
