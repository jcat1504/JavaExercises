    public class Solution {

private int n;
private int m;

public int numIslands(char[][] grid) {
    int count = 0;
    n = grid.length;
    if (n == 0) return 0;
    m = grid[0].length;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
            if (grid[i][j] == '1') {
                DFSMarking(grid, i, j);
                ++count;
            }
    }    
    return count;
}

private void DFSMarking(char[][] grid, int i, int j) {
    if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
    grid[i][j] = '0';
    DFSMarking(grid, i + 1, j);
    DFSMarking(grid, i - 1, j);
    DFSMarking(grid, i, j + 1);
    DFSMarking(grid, i, j - 1);
}

//better solution
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int numRows = grid.length; int numCols = grid[0].length;
        int count = 0;
        for(int row = 0; row < numRows; row++) {
            for(int col = 0; col < numCols; col++) {
                if(grid[row][col]=='1') {
                    count++;
                    dfs(grid,row,col);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int row, int col) {
        int numRows = grid.length; int numCols = grid[0].length;
        if(row<0 || row>=numRows || col<0 || col>=numCols || grid[row][col] =='0') {
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row-1, col);
        dfs(grid, row+1, col);
        dfs(grid, row, col-1);
        dfs(grid, row, col+1);
    }