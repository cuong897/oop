// Test cases for CharGrid -- a few basic tests are provided.

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CharGridTest {
	@Test
	public void testCharArea1() {
		char[][] grid = new char[][] {
				{'a', 'y', ' '},
				{'x', 'a', 'z'},
			};

		CharGrid cg = new CharGrid(grid);
				
		assertEquals(4, cg.charArea('a'));
		assertEquals(1, cg.charArea('z'));
	}
	
	@Test
	public void testCharArea2() {
		char[][] grid = new char[][] {
				{'c', 'a', ' '},
				{'b', ' ', 'b'},
				{' ', ' ', 'a'}
			};
		
		CharGrid cg = new CharGrid(grid);
		
		assertEquals(6, cg.charArea('a'));
		assertEquals(3, cg.charArea('b'));
		assertEquals(1, cg.charArea('c'));
	}
	@Test
	public void testcountPlus1(){
		char[][] grid = {
				{'.', '.', '.', '.', '.'},
				{'.', 'x', 'x', 'x', '.'},
				{'.', 'x', 'x', 'x', '.'},
				{'.', 'x', 'x', 'x', '.'},
				{'.', '.', '.', '.', '.'}
		};

		CharGrid charGrid = new CharGrid(grid);

		assertEquals(1, charGrid.countPlus()); // Có 1 dấu cộng
	}
	@Test
	public void testCountPlusComplex() {
		char[][] grid = {
				{'.', '.', '.', '.', '.', '.', '.'},
				{'.', 'x', 'x', 'x', '.', 'y', '.'},
				{'.', 'x', 'x', 'x', 'y', 'y', 'y'},
				{'.', 'x', 'x', 'x', '.', 'y', '.'},
				{'.', '.', 'z', '.', '.', 'y', '.'},
				{'z', 'z', 'z', 'z', 'z', '.', '.'},
				{'.', '.', 'z', '.', '.', '.', '.'}
		};

		CharGrid charGrid = new CharGrid(grid);

			assertEquals(3, charGrid.countPlus());
		// 1 dấu cộng với 'x', 1 dấu cộng với 'y', và 1 dấu cộng với 'z'
	}
	@Test
	public void testCountPlusSuperComplex() {
		char[][] grid = {
				{'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
				{'.', 'a', 'a', 'a', '.', 'b', 'b', 'b', '.', '.', '.'},
				{'.', 'a', 'a', 'a', '.', 'b', 'b', 'b', '.', 'c', '.'},
				{'.', 'a', 'a', 'a', '.', 'b', 'b', 'b', '.', 'c', '.'},
				{'.', '.', '.', '.', '.', 'b', 'b', 'b', '.', 'c', '.'},
				{'.', 'd', 'd', 'd', '.', '.', '.', '.', '.', 'c', '.'},
				{'.', '.', 'd', '.', '.', 'e', 'e', 'e', '.', 'c', '.'},
				{'.', '.', 'd', '.', '.', 'e', 'e', 'e', '.', '.', '.'},
				{'.', '.', '.', '.', '.', 'e', 'e', 'e', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.'}
		};

		CharGrid charGrid = new CharGrid(grid);
		int result = charGrid.countPlus();

		assertEquals(4313, result);
	}
	
	
}
