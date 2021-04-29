import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] priceArray = main.getInput();
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


    public static int calculateMaxProfit(int[] arr) {
        int lowestPriceTillThatDay = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i] > lowestPriceTillThatDay) {
                profit = arr[i] - lowestPriceTillThatDay;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowestPriceTillThatDay = arr[i];
            }
        }
        return maxProfit;
    }
}

