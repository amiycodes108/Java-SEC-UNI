class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], best = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            best = Math.max(best, price - minPrice);
        }
        return best;
    }
}
