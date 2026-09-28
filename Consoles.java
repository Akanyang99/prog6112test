public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSalesAmount;
    public Consoles(String consoleType, String storeName, int totalSalesAmount) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSalesAmount = totalSalesAmount;
    }
    @Override public String getConsoleType() { return consoleType; }
    @Override public String getStore() { return storeName; }
    @Override public int getTotalSales() { return totalSalesAmount; }
}
