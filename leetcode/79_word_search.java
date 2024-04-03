    // Given an m x n grid of characters board and a string word, return true if word exists in the grid.

    // The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

    

    // Example 1:


    // Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    // Output: true
    // Example 2:


    // Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
    // Output: true
    // Example 3:


    // Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
    // Output: false



    class Solution {
        public boolean exist(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (dfs(board, word, i, j, 0))
                        return true; 
                }
            }
            return false;
        }
        public boolean dfs(char[][] board, String word, int i, int j, int idx) {
             if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx))
                return false;
            if (idx == word.length() - 1)
                return true;
            char tmp = board[i][j];
            board[i][j] = '*';
            boolean res = dfs(board, word, i + 1, j, idx + 1) || dfs(board, word, i - 1, j, idx + 1) ||
                          dfs(board, word, i, j + 1, idx + 1) || dfs(board, word, i, j - 1, idx + 1);
            board[i][j] = tmp;
            
            return res;
        }
    }