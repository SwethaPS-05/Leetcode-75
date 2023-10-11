class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        return 1;
        int s=9,r=9,t=n;
        while(n-->1)
        s*=r--;     
        return s+countNumbersWithUniqueDigits(t-1);
    }
}
