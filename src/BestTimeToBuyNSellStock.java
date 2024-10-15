public class BestTimeToBuyNSellStock {
    public static int maxProfit(int[] prices) {

//        int minPrice = prices[0];
//        int maxPrice = 0;
//        int minDay = 0;
//        int maxDay = 0;
//        for(int i: prices){
//            if((i+1) < prices.length && prices[i] < minPrice){
//                minPrice = prices[i];
//                minDay = i;
//            } else if ((i+1) < prices.length && prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                maxDay = i;
//            }
//        }
//
//        System.out.println("minPrice: " + minPrice + ", minDay: " + minDay);
//        System.out.println("maxPrice: " + maxPrice + ", maxDay: " + maxDay);
//
//        if (maxDay < minDay){
//            return 0;
//        }
//         return maxPrice-minPrice;

        //More optimized way
        //Only want to track maxProfit and minPrice
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            //Calculate max profit while you are looping through prices
            int profit = price - minPrice; //Finding current profit
            //Update maxProfit to current profit if its larger
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
