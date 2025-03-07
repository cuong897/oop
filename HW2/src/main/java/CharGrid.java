// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	public CharGrid(CharGrid cc){ this.grid =cc.grid;}
	
	/**
	 * Returns the area for the given char in the grid (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int row= grid.length;
		int col= grid[0].length;
		int maxi=-1,maxj=-1,mini=row,minj=col;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(grid[i][j]==ch){
					if(maxi<i) maxi=i;
					if(maxj<j) maxj=j;
					if(mini>i) mini=i;
					if(minj>j) minj=j;

				}
			}
		}
		if(maxi==-1||maxj==-1) return 0;

		return (maxi-mini+1)*(maxj-minj+1); // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int count =0;
		int row= grid.length;
		int col= grid[0].length;
		for(int i=1;i<row-1;i++){
			for(int j=1;j<col-1;j++){
				char val=grid[i][j];
				int lengthNhanh=0;
				while(i-lengthNhanh>-1&&i+lengthNhanh<row&&j+lengthNhanh<col&&j-lengthNhanh>-1&&grid[i-lengthNhanh][j]==val&&grid[i+lengthNhanh][j]==val&&grid[i][j-lengthNhanh]==val&&grid[i][j+lengthNhanh]==val){
					lengthNhanh++;
				}
				if(lengthNhanh>1) count++;
			}
		}
		return count; // YOUR CODE HERE
	}
	
}
