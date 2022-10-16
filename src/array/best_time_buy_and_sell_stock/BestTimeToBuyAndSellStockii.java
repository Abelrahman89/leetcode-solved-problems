package array.best_time_buy_and_sell_stock;

public class BestTimeToBuyAndSellStockii {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 2, 5, 7, 4}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{5, 1, 4, 7, 6, 10}));
        System.out.println(maxProfit(new int[]{2, 4, 1}));
        System.out.println(maxProfit(new int[]{2,1,2,0,1}));

        System.out.println(maxProfitOld(new int[]{1, 2,4}));
    }
    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1])
                result+=prices[i]-prices[i-1];
        }
        return result;
    }
    public static int maxProfitOld(int[] prices) {
        int result = 0;
        if (prices.length > 1) {
            int min = prices[0], max = -1;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    if (max > -1 && min > -1) {
                        result += max - min;
                        min = prices[i];
                        max = -1;
                    } else {
                        min = prices[i];
                        max = -1;
                    }
                } else {
                    if (prices[i] > max) {
                        max = prices[i];
                    } else {
                        result += max - min;
                        min = prices[i];
                        max = -1;
                    }
                }
            }
            if (max >-1 && min > -1)
                result += max - min;
        }
        return result;
    }
}
