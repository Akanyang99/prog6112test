public abstract class Consoles {
    protected String consoleType;
    protected String storeName;
    protected int totalSalesAmount;

    public Consoles(String consoleType, String storeName, int totalSalesAmount) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSalesAmount = totalSalesAmount;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSalesAmount;
    }
}
