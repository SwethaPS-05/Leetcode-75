class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int id = 0, max = -1;
        for (int i = 0; i < bin.length(); i++) {
            char c = bin.charAt(i);
            if (c == '1') {
                int cur = i - id;
                if (max < cur) {
                    max = cur;
                }
                id = i;
            }
        }
        return max;
    }
}
