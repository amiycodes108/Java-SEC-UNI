import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            int minCol = 0;
            for (int c = 1; c < matrix[0].length; c++)
                if (matrix[r][c] < matrix[r][minCol]) minCol = c;
            int value = matrix[r][minCol];
            boolean largest = true;
            for (int row = 0; row < matrix.length; row++)
                if (matrix[row][minCol] > value) largest = false;
            if (largest) result.add(value);
        }
        return result;
    }
}
