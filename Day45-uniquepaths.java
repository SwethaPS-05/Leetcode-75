class Solution {
    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        int i, j;
        for(i=0; i<m; i++)
            array[i][0] = 1;
        for(i=0; i<n; i++)
            array[0][i] = 1;
        for(i=1; i<m; i++)
            for(j=1; j<n; j++)
                array[i][j] = array[i-1][j] + array[i][j-1];
        return array[m-1][n-1];
    }
}
