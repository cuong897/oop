//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    public boolean[][] grid;

    /**
     * Constructs a new instance with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }


    /**
     * Does row-clearing on the grid (see handout).
     * actually col-clearing.
     */
    public void clearRows() {
        int row = grid.length;
        int col = grid[0].length;
        for (int j = 0; j < col; ) {
            boolean IsAllTrue = true;
            for (int i = 0; i < row; i++) {
                if (grid[i][j] == false) {
                    IsAllTrue = false;
                    break;
                }
            }
            if (IsAllTrue) {
                for (int i = 0; i < row; i++) {
                    for (int k = j; k < col - 1; k++) {
                        grid[i][k] = grid[i][k + 1];
                    }
                    grid[i][col - 1] = false;
                }
            } else {
                j++;
            }
        }
    }

    /**
     * Returns the internal 2d grid array.
     *
     * @return 2d grid array
     */
    boolean[][] getGrid() {
        return null; // YOUR CODE HERE
    }

}
