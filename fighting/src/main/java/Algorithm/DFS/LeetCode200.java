package Algorithm.DFS;

public class LeetCode200 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length==0)
            return 0;
        int result =0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1'){
                    result++;
                    dfs(grid,i,j,row,col);//发现第一个1，用dfs找它的附近是否还有其他的1，这些1会形成岛屿，找出来置0
                }
            }
        }
        return result;
    }

    public void dfs(char[][] grid,int x,int y,int row,int col){
        if(x<0 || y<0 || x>=row || y>=col || grid[x][y] == '0')
            return;
        grid[x][y]='0';
        dfs(grid,x+1,y,row,col);//下
        dfs(grid,x-1,y,row,col);//上
        dfs(grid,x,y-1,row,col);//左
        dfs(grid,x,y+1,row,col);//右
    }
}
