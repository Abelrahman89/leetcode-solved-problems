package array.best_time_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,result=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1]) {
                max=prices[i];
                min=Math.min(prices[i-1],min);
                result=Math.max(result,(max-min));
            }
        }



        return result;

    }
}
