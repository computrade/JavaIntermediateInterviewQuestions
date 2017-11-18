package computrade.puzzle.array;

import org.junit.Assert;
import org.junit.Test;

public class IterateMutliDimenArraySpiralTest {

    /**
     * Test the logic to get the elements of 2D matrix in a spiral way.
     * for example: 
     * if int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
     * The output should be {1,2,3,6,9,8,7,4,5}
     */
  
	@Test
    public void test3on3() {

        int[][] input1 = new int[][]{
        		{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        int [] expecteds = new int[]{1,2,3,6,9,8,7,4,5};
        int [] actuals =  IterateMutliDimenArraySpiral.getSpiralArray(input1);
        
        Assert.assertArrayEquals(expecteds, actuals);
        
    }
	
	@Test
    public void test3on4() {

        int[][] input2 = new int[][]{
        		{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        
        int [] expecteds = new int[]{1,2,3,4,8,12,11,10,9,5,6,7};
        int [] actuals =  IterateMutliDimenArraySpiral.getSpiralArray(input2);
        
        Assert.assertArrayEquals(expecteds, actuals);
    }
	
	@Test
	public void test5on5(){
		
        int[][] input3  = new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        };
        
        int [] expecteds = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int [] actuals =  IterateMutliDimenArraySpiral.getSpiralArray(input3);

        Assert.assertArrayEquals(expecteds, actuals);
	
	}
	
	

}