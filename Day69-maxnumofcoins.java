import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int j = piles.length - 1;
        int ans = 0;
        for (int i = 0; i < piles.length / 3; i++) {
            j--;
            ans += piles[j];
            j--;
        }
        return ans;
    }
}
