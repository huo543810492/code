package Algorithm.UnionFind;


public class MyUnionFind { //是根据力扣200题写出来的模板类
    int[] root=null;
    int count;

    public MyUnionFind(char[][] grid){//构造函数
        int row = grid.length;
        int col = grid[0].length;
        count = row*col;
        root=new int[row*col];

        for (int i = 0; i <row*col ; i++) {
            root[i]=i;
        }
    }

    public int find(int x){//递归找x的根节点，直到索引值x和存的值相等,认为找到根节点了
        if(root[x]==x)
            return x;
        // else{
        //     root[x]=find(root[x]);//可有可无
        // }
        return find(root[x]);
    }

    public void union(int x, int y){
        int rootX=find(x);
        int rootY=find(y);
        if (rootX!=rootY)//如果两个相等，说明已经被同化了，也不用统计unionTimes
        {
            root[rootX]=rootY ;//认新的老大
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
