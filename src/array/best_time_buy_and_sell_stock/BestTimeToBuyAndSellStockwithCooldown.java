package array.best_time_buy_and_sell_stock;

public class BestTimeToBuyAndSellStockwithCooldown {
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
        System.out.println(maxProfit(new int[]{1}));
        System.out.println(maxProfit(new int[]{1, 2,4}));
        System.out.println(maxProfit(new int[]{2,1,2,0,1}));



    }
    public static int maxProfit2(int[] prices) {
        int result=maxProfitold(prices);
        int result2=maxProfit(prices);
        return Math.max(result, result2);
    }
    public static int maxProfitold(int[] prices) {
        int result = 0;
        int i = 1;
        while (i < prices.length) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
                i += 2;
            } else
                i++;
        }
        return result;
    }
    public static int maxProfit(int[] prices) {
        int sold =Integer.MIN_VALUE, held =Integer.MIN_VALUE, reset = 0;

        for (int price : prices) {
            int preSold = sold;

            sold = held + price;
            held = Math.max(held, reset - price);
            reset = Math.max(reset, preSold);
        }

        return Math.max(sold, reset);
    }
}

