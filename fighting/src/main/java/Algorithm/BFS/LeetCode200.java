package Algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode200 {  //3个点需要注意，1.早置0  2.queue存两个相关的数字  3.x-1>=0 是可以等于的
        public int numIslands(char[][] grid) {
            if(grid == null || grid.length==0)
                return 0;
            int result =0;
            int row = grid.length;
            int col = grid[0].length;
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(grid[i][j] == '1'){
                        result++;
                        queue.add(i*col+j); //2.用queue存两个相关的数字
                        grid[i][j] = '0';
                        bfs(grid,queue,row,col);//发现第一个1，用bfs找它的附近是否还有其他的1，这些1会形成岛屿，找出来置0
                    }
                }
            }
            return result;
        }

        public void bfs(char[][] grid, Queue<Integer> queue, int row,int col){

            while(!queue.isEmpty()){
                int temp = queue.poll();
                int x = temp/col;//2.用queue存两个相关的数字
                int y = temp%col;
                // grid[x][y] = '0';  //1.这里想了好久为什么不能在这里置零，而是必须在下面四个if里面置零，笔记里有写
                if(x+1<row&&grid[x+1][y]=='1')
                {
                    queue.add((x+1)*col+y);
                    grid[x+1][y]='0';
                }
                if(y+1<col&&grid[x][y+1]=='1')
                {
                    queue.add(x*col+y+1);
                    grid[x][y+1]='0';

                }
                if(x-1>=0&&grid[x-1][y]=='1')  //3.注意这里 x-1>=0 可以等于0
                {
                    queue.add((x-1)*col+y);
                    grid[x-1][y]='0';
                }
                if(y-1>=0&&grid[x][y-1]=='1')
                {
                    queue.add(x*col+y-1);
                    grid[x][y-1]='0';
                }
            }
        }
}