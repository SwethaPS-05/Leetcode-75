class Solution {
    public int maxProfit(int[] num) {
        int profit = 0;
        for(int i=1;i<num.length;i++){
            if(num[i]>num[i-1]){
                profit += num[i]-num[i-1];
            }
        }
           return profit;
    }
}
