/*A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid*/
import java.util.HashSet;

public class warehouse {
    public static void analyzeStock(int[] stock) {
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int quantity : stock) {
            if (quantity > max) {
                max = quantity;
            }
            if (quantity < min) {
                min = quantity;
            }
            total += quantity;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);
    }

    public static void findDuplicates(int[] stock) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int quantity : stock) {
            if (!seen.add(quantity)) {
                duplicates.add(quantity);
            }
        }

        System.out.println("Duplicate Quantities: " + duplicates);
    }
    public static void rotateArray(int[] stock, int k) {
        int n = stock.length;
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.print("Rotated Stock Array: ");
        for (int value : rotated) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[][] transposeGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = grid[i][j];
            }
        }

        return transpose;
    }
    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] stock = {50, 20, 70, 20, 90, 50};

        System.out.println("Stock Analysis:");
        analyzeStock(stock);

        findDuplicates(stock);

        rotateArray(stock, 2);

        int[][] shelfGrid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nOriginal Shelf Grid:");
        printGrid(shelfGrid);

        int[][] transposedGrid = transposeGrid(shelfGrid);

        System.out.println("\nTransposed Shelf Grid:");
        printGrid(transposedGrid);
    }
}