public class GamingConsoleReport {
    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] salesMatrix = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        int[] computedTotals = new int[cities.length];
        int maxSalesValue = -1;
        String topPerformingCity = "";

        System.out.println("-----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%-15s%n", "", "PSS", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-15d%-15d%-15d%n", cities[i], salesMatrix[i][0], salesMatrix[i][1], salesMatrix[i][2]);
            computedTotals[i] = salesMatrix[i][0] + salesMatrix[i][1] + salesMatrix[i][2];
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%d%n", cities[i], computedTotals[i]);
            if (computedTotals[i] > maxSalesValue) {
                maxSalesValue = computedTotals[i];
                topPerformingCity = cities[i];
            }
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topPerformingCity);
        System.out.println("-----------------------------------------------------------------");
    }
}
