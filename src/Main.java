import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] priceArray = main.getInput();
        int result = calculateMaxProfit(priceArray);
        System.out.println("The most profit from this periods is: " + result);
    }

    private int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int daysNumber = scanner.nextInt();
        int[] priceHistory = new int[daysNumber];
        System.out.println("Enter the each day price: ");
        for (int i = 0; i < daysNumber; i++) {
            System.out.println("the Day number " + (i + 1) + " price is: ");
            priceHistory[i] = scanner.nextInt();
        }
        return priceHistory;
    }

    public static int calculateMaxProfit(int[] inputArray) {
        int lowestPrice = inputArray[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            int profit = 0;
            if (inputArray[i] > lowestPrice) {
                profit = inputArray[i] - lowestPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowestPrice = inputArray[i];
            }
        }
        return maxProfit;
    }
}

