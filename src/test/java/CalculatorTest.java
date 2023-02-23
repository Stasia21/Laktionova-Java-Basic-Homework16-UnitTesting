import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CalculatorTest {

    @Test
    public void testCalculateAverage() {
        Calculator calculator = new Calculator();
        int[] arr = {1, 2, 3, 4, 5};
        int average = Calculator.calculateAverage(arr);
        Assert.assertArrayEquals(new Integer[]{3}, new Integer[]{average});
    }

    @Test
    public void testSquareOfMatrix() {
        Calculator calculator = new Calculator();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        if (Calculator.squareOfMatrix(matrix)) {
            System.out.println("Матриця є квадратною");
        } else {
            System.out.println("Матриця не є квадратною");
        }
    }
}