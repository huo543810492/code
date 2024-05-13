package Algorithm.Top100LikedQuestions;

public class LeetCode79 {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(backTracking(board,word,0,i, j)) //注意这里不是直接return，防止一次不成功，忽略之后的成功
                        return true;
                }
            }
        }
        return false;
    }

    private boolean backTracking(char[][] board, String word, int index, int i, int j)
    {

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(index))
            return false;
        if(index==word.length()-1) //这里是长度减一
            return true;
        board[i][j] = '#';
        if(backTracking(board,word,index+1,i+1, j)) //注意要return
            return true;
        if(backTracking(board,word,index+1,i, j+1))
            return true;
        if(backTracking(board,word,index+1,i, j-1))
            return true;
        if(backTracking(board,word,index+1,i-1, j))
            return true;

        board[i][j] = word.charAt(index);
        return false;
    }
}
