public class maxProfit {
    public static void main(String[] args) {
        int prices[] = {1, 2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int maxPrices = 0;
        int op = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];

            }
            maxPrices = prices[i] - min;
            if (op < maxPrices) {
                op = maxPrices;
            }
        }
        return op;
    }

}




