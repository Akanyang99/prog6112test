public class ConsoleSales extends Console {
    public ConsoleSales(String consoleType, String storeName, int totalSalesAmount) {
        super(consoleType, storeName, totalSalesAmount);
    }
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("*********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
