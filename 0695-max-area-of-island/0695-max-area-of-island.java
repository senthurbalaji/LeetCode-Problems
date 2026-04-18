class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int count = dfs(i, j, grid);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
    public static int dfs(int i, int j, int grid[][]){
        if(!isValid(i, j, grid) || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(i+1, j, grid);
        count += dfs(i-1, j, grid);
        count += dfs(i, j+1, grid);
        count += dfs(i, j-1, grid);
        return count;
    }
    public static boolean isValid(int r, int c, int grid[][]){
        return (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length);
    }
}