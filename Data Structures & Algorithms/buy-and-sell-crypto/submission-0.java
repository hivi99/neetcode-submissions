class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int m;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            else{
                 m = prices[i]-min;
                if(m>max){
                    max = m;
                }
            }



        }
        return max;
    }
}
