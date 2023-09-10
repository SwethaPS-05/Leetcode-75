class Solution {
       int [] a = new int[50];
    public int climbStairs(int n) {
     
        if(n < 0) 
        return 0;
        if(n == 0) 
        return 1;
    int val = a[n];
        if(val != 0)
            return val;
        val = climbStairs(n - 1) + climbStairs(n - 2);
        a[n] = val;
        return val;
    }
}
