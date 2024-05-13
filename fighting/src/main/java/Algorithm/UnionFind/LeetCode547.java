package Algorithm.UnionFind;

public class LeetCode547 {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected==null || isConnected.length==0)
            return 0;
        UnionFind unionFind = new UnionFind(isConnected);
        int col=isConnected[0].length;
        int row=isConnected.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(isConnected[i][j]==1){
                    unionFind.union(i,j);
                }
            }
        }
        return unionFind.getCount();
    }
    class UnionFind{
        int count;
        int[] root;
        public UnionFind(int[][] array){
            count=array.length;
            root=new int[count];
            for(int i =0;i<root.length;i++){
                root[i]=i;
            }
        }

        public int find(int x){
            if(root[x]==x)
                return x;
            return find(root[x]);
        }

        public void union(int x, int y){
            int rootx = find(x);
            int rooty = find(y);
            if(rootx != rooty){
                root[rootx] = rooty;
                count--;
            }
        }

        public int getCount(){
            return count;
        }
    }
}
