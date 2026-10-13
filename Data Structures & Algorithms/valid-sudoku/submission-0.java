class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Validate rows

        for (char[] row : board) {
            Set<Character> rowSet = new HashSet<>(board.length);
            int numberCount = 0;
            for (char c : row) {
                if (c != '.') {
                    rowSet.add(c);
                    numberCount++;
                }
            }
            if (numberCount != rowSet.size()) {
                return false;
            }
        }

        // Validate column
        for (int col = 0; col < board.length; col++) {
            Set<Character> colSet = new HashSet<>(board.length);
            int numberCount = 0;
            for (char[] row : board) {
                if (row[col] != '.') {
                    colSet.add(row[col]);
                    numberCount++;
                }
            }
            if (numberCount != colSet.size()) {
                return false;
            }
        }

        // Validate sub boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                Set<Character> boxSet = new HashSet<>();
                int numberCount = 0;
                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        if (board[r][c] != '.') {
                            boxSet.add(board[r][c]);
                            numberCount++;
                        }
                    }
                }
                if (numberCount != boxSet.size()) {
                    return false;
                }
            }
        }

        return true;
    }
}
