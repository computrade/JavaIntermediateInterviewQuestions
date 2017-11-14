package computrade.puzzle.array;

public class PrintMutliDimenArraySpiral {

    /**
     * Write a logic to print the elements of 2D matrix in a spiral way?
     * <p>
     * for eg if int[][] matrix = {{1,2,3,4}{5.6,7,8}{9, 10, 11,12}};
     * The output should be 1 2 3 4 8 12 11 10 9 5 6 7
     * The interviewer asked me to implement a recursive algorithm.
     *
     * @param args
     */
    public static void main(String[] args) {

        //example 1
        int[][] m = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        //example 2
        int[][] m1 = new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        };
        PrintMutliDimenArraySpiral printer = new PrintMutliDimenArraySpiral();
        printer.printMatrix(m, new int[]{0, m.length - 1},
                new int[]{0, m[0].length - 1}, Direction.LEFT_RIGHT);

        System.out.println();
        printer.printMatrix(m1, new int[]{0, m1.length - 1},
                new int[]{0, m1[0].length - 1}, Direction.LEFT_RIGHT);

        System.out.println();

    }

    enum Direction {
        DEFAULT, LEFT_RIGHT, TOP_DOWN, RIGHT_LEFT, DOWN_TOP;
    }

    /*
    Imagine a big block of soft material (rectangular).
    You will take slices from this material where thickness
    of slice is 1 row or 1 column
    Take Ninja sword and cut off the top part from LEFT to RIGHT ( SLIIIIICE!).
    Next cut slice on the right side from TOP to BOTTOM  ( SLIIIIICE!)
    Next cut slice from BOTTOM from RIGHT TO LEFT  ( SLIIIIICE!)
    Next cut slice from left side from BOTTOM to top  ( SLIIIIICE!)
    Repeat till there is NOTHING left

     */
    void printMatrix(int[][] m, int[] rowRange, int[] colRange, Direction d) {

        if (rowRange[1] - rowRange[0] < 0) return;
        if (colRange[1] - colRange[0] < 0) return;

        Direction next = Direction.DEFAULT;

        switch (d) {
            case LEFT_RIGHT:
                for (int x = rowRange[0], y = colRange[0]; y <= colRange[1]; y++)
                    System.out.printf("%d ", m[x][y]);
                rowRange[0]++;
                next = Direction.TOP_DOWN;
                break;

            case TOP_DOWN:
                for (int x = rowRange[0], y = colRange[1]; x <= rowRange[1]; x++)
                    System.out.printf("%d ", m[x][y]);
                colRange[1]--;
                next = Direction.RIGHT_LEFT;
                break;

            case RIGHT_LEFT:
                for (int x = rowRange[1], y = colRange[1]; y >= colRange[0]; --y)
                    System.out.printf("%d ", m[x][y]);
                rowRange[1]--;
                next = Direction.DOWN_TOP;
                break;

            case DOWN_TOP:
                for (int x = rowRange[1], y = colRange[0]; x >= rowRange[0]; --x)
                    System.out.printf("%d ", m[x][y]);
                colRange[0]++;
                next = Direction.LEFT_RIGHT;
                break;
            case DEFAULT:
                throw new RuntimeException("invalid direction");

        }
        printMatrix(m, rowRange, colRange, next);
    }
}