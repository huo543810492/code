package Algorithm.UnionFind;

import java.util.Arrays;

public class LeetCode200 {
    static MyUnionFind unionFind;
    public static int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)
            return 0;
        int waters=0;
        int row=grid.length;
        int col=grid[0].length;
        unionFind = new MyUnionFind(grid);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    if(i-1>=0&&grid[i-1][j]=='1')
                    {
                        unionFind.union((i-1)*col+j, i*col+j);
                    }
                    // unionFind.union((i-1)*col+j, i*col+j);

                    if(j-1>=0&&grid[i][j-1]=='1')
                    // unionFind.union(i*col+j-1, i*col+j);
                    {
                        unionFind.union(i*col+j-1, i*col+j);
                    }

                    if(i+1<row&&grid[i+1][j]=='1')
                    // unionFind.union((i+1)*col+j, i*col+j);
                    {
                        unionFind.union((i+1)*col+j, i*col+j);
                    }
                    if(j+1<col&&grid[i][j+1]=='1')
                    // unionFind.union(i*col+j+1, i*col+j);
                    {
                        unionFind.union(i*col+j+1, i*col+j);
                    }
                }
                else {
                    waters++;
                }
            }
        }
        return unionFind.getCount()-waters;
    }

    public static void main(String[] args) {
        char[][] test = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        System.out.println(numIslands(test));
        System.out.println(Arrays.toString((unionFind.root)));
    }
}
