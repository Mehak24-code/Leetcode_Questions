class Solution {

    public void dfs(char grid[][], int row, int col) {

        int n = grid.length;
        int m = grid[0].length;

        if(row < 0 || col < 0 || row >= n || col >= m || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row-1, col);
        dfs(grid, row+1, col);
        dfs(grid, row, col-1);
        dfs(grid, row, col+1);
    }

    public int numIslands(char mat[][]) {

        int n = mat.length;
        int m = mat[0].length;

        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(mat[i][j] == '1') {
                    count++;
                    dfs(mat, i, j);
                }
            }
        }

        return count;
    }
}