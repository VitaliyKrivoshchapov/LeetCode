import java.util.*;

import static java.util.Arrays.*;

import java.util.Collections;
import java.util.concurrent.LinkedBlockingDeque;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockSolution bt = new BestTimeToBuyAndSellStockSolution();
        int [] prices = {7,1,5,3,6,4};
        System.out.println(bt.maxProfit(prices));
    }

}


class BestTimeToBuyAndSellStockSolution{
    public static int maxProfit(int[] prices) {
        int minPrice = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else
                if(maxProfit > prices[i] - minPrice){
                    maxProfit = prices[i] - minPrice;
                }
        }
        return maxProfit;
    }
}
//prices[i] - minPrice > maxProfit)


