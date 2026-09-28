/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication2;

public class Main {

    public static void main(String[] args) {

        // Single-dimensional array for the cities
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Two-dimensional array for console sales
        // Column 0 = PS5
        // Column 1 = XBOX
        // Column 2 = SWITCH
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display report heading
        System.out.println("==========================================");
        System.out.println("          GAMING CONSOLE REPORT");
        System.out.println("==========================================");

        // Display city names
        System.out.println();
        System.out.println("Cities:");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        // Display PS5 sales
        System.out.println();
        System.out.println("PS5 SALES:");

        for (int i = 0; i < cities.length; i++) {
            System.out.println("PS5: " + sales[i][0] + " for " + cities[i]);
        }

        // Display XBOX sales
        System.out.println();
        System.out.println("XBOX SALES:");

        for (int i = 0; i < cities.length; i++) {
            System.out.println("XBOX: " + sales[i][1] + " for " + cities[i]);
        }

        // Display SWITCH sales
        System.out.println();
        System.out.println("SWITCH SALES:");

        for (int i = 0; i < cities.length; i++) {
            System.out.println("SWITCH: " + sales[i][2] + " for " + cities[i]);
        }

        // Calculate total sales for each city
        int[] totalSales = new int[cities.length];

        for (int i = 0; i < cities.length; i++) {
            totalSales[i] = sales[i][0]
                          + sales[i][1]
                          + sales[i][2];
        }

        // Display total sales
        System.out.println();
        System.out.println("TOTAL SALES:");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + ": " + totalSales[i]);
        }

        // Find the city with the highest sales
        int highestSales = totalSales[0];
        int highestCityIndex = 0;

        for (int i = 1; i < totalSales.length; i++) {

            if (totalSales[i] > highestSales) {
                highestSales = totalSales[i];
                highestCityIndex = i;
            }
        }

        // Display highest sales city
        System.out.println();
        System.out.println("HIGHEST SALES CITY:");
        System.out.println(cities[highestCityIndex] + ": " + highestSales);

        System.out.println();
        System.out.println("==========================================");
    }
}
