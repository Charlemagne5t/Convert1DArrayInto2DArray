class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k = original.length;

        int t = 0;
        int[][] res = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(t == k) {
                    return new int[][]{};
                }
                res[i][j] = original[t++];
            }
        }
        if(t != k) {
            return new int[][]{};
        }

        return res;
    }
}