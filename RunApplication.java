import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter console type: ");
        String consoleType = sc.nextLine().toUpperCase();
        
        System.out.print("Enter store name: ");
        String storeName = sc.nextLine().toUpperCase();
        
        System.out.print("Enter total sales amount: ");
        int totalSales = sc.nextInt();
        
        // Instantiate ConsoleSales
        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
        
        // Call report method
        sales.printReport();
        
        sc.close();
    }
}
