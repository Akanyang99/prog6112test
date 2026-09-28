public class Console extends Consoles implements IConsoles {
    public Console(String consoleType, String storeName, int totalSalesAmount) {
        super(consoleType, storeName, totalSalesAmount);
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
