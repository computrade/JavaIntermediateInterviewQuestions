package computrade.puzzle.array;

public class IterateMutliDimenArraySpiral {

	/**
	 * This class implements the logic to get the elements of 2D matrix in a spiral way.
	 * for example:
	 * 	 if int[][] matrix = {{1,2,3,4},{5.6,7,8},{9, 10, 11,12}}; 
	 * The output should be {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}
	 */

	enum Direction {
		LEFT_RIGHT, TOP_DOWN, RIGHT_LEFT, DOWN_TOP;
	}
	
	public static int[] getSpiralArray(int[][] matrix) {

		Direction direction = Direction.LEFT_RIGHT;

		int sizeOfOut = matrix.length * matrix[0].length;
		int output[] = new int[sizeOfOut];
		int oIndex = 0;

		int[] rowRange = { 0, matrix.length - 1 };
		int[] colRange = { 0, matrix[0].length - 1 };

		while (true) {
	
			switch (direction) {
			case LEFT_RIGHT:
				for (int x = rowRange[0], y = colRange[0]; y <= colRange[1]; y++)
					output[oIndex++] = matrix[x][y];
				rowRange[0]++;
				direction = Direction.TOP_DOWN;
				break;

			case TOP_DOWN:
				for (int x = rowRange[0], y = colRange[1]; x <= rowRange[1]; x++)
					output[oIndex++] = matrix[x][y];
				colRange[1]--;
				direction = Direction.RIGHT_LEFT;
				break;

			case RIGHT_LEFT:
				for (int x = rowRange[1], y = colRange[1]; y >= colRange[0]; --y)
					output[oIndex++] = matrix[x][y];
				rowRange[1]--;
				direction = Direction.DOWN_TOP;
				break;

			case DOWN_TOP:
				for (int x = rowRange[1], y = colRange[0]; x >= rowRange[0]; --x)
					output[oIndex++] = matrix[x][y];
				colRange[0]++;
				direction = Direction.LEFT_RIGHT;
				break;
			}
			
			if (rowRange[1] < rowRange[0])
				break;
			if (colRange[1] < colRange[0])
				break;
		}

		return output;

	}
}