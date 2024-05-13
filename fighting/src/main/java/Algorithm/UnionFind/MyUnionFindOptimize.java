package Algorithm.UnionFind;


public class MyUnionFindOptimize { //做了两个优化
    int[] root=null;
    int[] size=null;//权重
    int count;

    public MyUnionFindOptimize(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        count = row*col;
        root=new int[row*col];
        size=new int[row*col];

        for (int i = 0; i <row*col ; i++) {
            root[i]=i;
            size[i]=0;
        }
    }

    public int quickFind(int x){//查找的时候顺便更新，下次查找更快
        if(root[x]==x)
            return x;
         else{
             root[x]=quickFind(root[x]);
         }
        return root[x];
    }

    public void union(int x, int y){
        int rootX=quickFind(x);
        int rootY=quickFind(y);
        if (rootX!=rootY)
        {
            if (size[rootX] > size[rootY]){
                root[rootY]=rootX;
                size[rootX]=size[rootY]+size[rootX];
            }
            else{
                root[rootX]=rootY;
                size[rootY]=size[rootY]+size[rootX];
            }
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
