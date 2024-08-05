class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int idx, int i, int j, boolean[][] visited) {
        if (idx == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }
        
        visited[i][j] = true;
        
        boolean found = helper(board, word, idx + 1, i - 1, j, visited) ||
                        helper(board, word, idx + 1, i + 1, j, visited) ||
                        helper(board, word, idx + 1, i, j - 1, visited) ||
                        helper(board, word, idx + 1, i, j + 1, visited);
        
        visited[i][j] = false;
        return found;
    }
}
