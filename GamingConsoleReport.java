public class GamingConsoleReport {
    public static void main(String[] args) {
        // Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Two-dimensional array tracking [3 Cities][3 Columns: PS5, XBOX, SWITCH]
        int[][] salesMatrix = {
            {1000, 2000, 3000}, // CAPE TOWN
            {2000, 3000, 4000}, // PORT ELIZABETH
            {1500, 1100, 1200} // PRETORIA
        };

        // Summary reporting tracker metrics
        int maxSalesValue = -1;
        String topPerformingCity = "";
        int[] computedTotals = new int[cities.length];

        // Print header
        System.out.println("-----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%-15s%n", "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-15d%-15d%-15d%n",
                    cities[i], salesMatrix[i][0], salesMatrix[i][1], salesMatrix[i][2]);

            // Row-wise total aggregation
            computedTotals[i] = salesMatrix[i][0] + salesMatrix[i][1] + salesMatrix[i][2];
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------");

        // Process final metrics and evaluate top performance bounds
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
