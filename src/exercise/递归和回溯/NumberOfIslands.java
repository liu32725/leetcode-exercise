package exercise.递归和回溯;

public class NumberOfIslands {
    private int count = 0;
    private int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int n, m;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    visited[i][j] = true;
                    count++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return count;
    }
    private boolean inArea(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    private void dfs(char[][] grid, int x, int y, boolean[][] visited) {
        for(int i = 0; i < 4; i++) {
            int newx = x + d[i][0];
            int newy = y + d[i][1];
            if(inArea(newx, newy) && !visited[newx][newy] && grid[newx][newy] == '1') {
                visited[newx][newy] = true;
                dfs(grid, newx, newy, visited);
            }
        }
    }
}
