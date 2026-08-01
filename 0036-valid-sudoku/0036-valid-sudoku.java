class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Track seen numbers (1-9) for each of the 9 rows, columns, and sub-boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                
                // Skip empty cells
                if (current == '.') {
                    continue;
                }

                // Map character '1'-'9' to array index 0-8
                int num = current - '0' - 1;

                // Calculate the 3x3 sub-box index (0 to 8)
                int boxIndex = (i / 3) * 3 + (j / 3);

                // If the number has already been seen in this row, column, or box, it's invalid
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark the number as seen
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
