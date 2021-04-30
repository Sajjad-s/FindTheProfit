import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] priceArray = main.getInput();
        System.out.println( calculateMaxProfit(priceArray));
    }

    private int[] getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int daysNumber = scanner.nextInt();
        int[] priceHistory = new int[daysNumber];
        for (int i = 0; i < daysNumber; i++) {
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

