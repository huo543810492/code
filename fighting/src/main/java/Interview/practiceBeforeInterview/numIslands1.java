package Interview.practiceBeforeInterview;

public class numIslands1 {
    public static void main(String[] args) {
        char[][] array = {  {'1','1','1','1','0'},
                {'1','1','0','1','0'},
        {'1','1','0','0','0'},
            {'0','0','0','0','0'}};

        System.out.println(numIslands(array));
    }

    public static int numIslands(char[][] grid) {
        int res=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }

    public static void dfs(char[][] grid,int i,int j){
        if(grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        if(i>0 && i<grid.length && j>0 && j<grid[0].length){
            dfs(grid,i-1,j);
            dfs(grid,i+1,j);
            dfs(grid,i,j-1);
            dfs(grid,i,j+1);
        }
    }
}
