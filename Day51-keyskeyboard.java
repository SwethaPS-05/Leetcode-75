class Solution {
    public int minSteps(int n) {
        int a[] = new int[n+1];
        for(int i=2;i<n+1;i++)
        {
            a[i] = i;
            for(int j=1;j<i/2;j++)
            {
                if(i%j==0)
                a[i] = Math.min(a[i],a[j]+i/j);
            }
        }
        return a[n];
    }
}
