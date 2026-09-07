class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> rowMap = new HashMap<>();
        Map<Integer, HashSet<Character>> colMap = new HashMap<>();
        Map<String, HashSet<Character>> squareMap = new HashMap<>();

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.') continue;
                String squareKey = row/3 + "," + col/3;
                if( 
                rowMap.computeIfAbsent(row, k -> new HashSet<>()).contains(board[row][col]) ||
                colMap.computeIfAbsent(col, k -> new HashSet<>()).contains(board[row][col]) ||
                squareMap.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[row][col])){
                    return false;
                }

                rowMap.get(row).add(board[row][col]);
                colMap.get(col).add(board[row][col]);
                squareMap.get(squareKey).add(board[row][col]);
            }
        }
        return true;
    }
}
