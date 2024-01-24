class Solution {
    /*
    left = 0, right = last index

    while left is not past the right
        middle = right + left / 2

        int curr = matrix[middle / matrix[0].length][matrix % 
matrix[0].length];
        if (curr == target)
            return true
        else (curr > target)
            right = middle - 1
        else 
            left = middle + 1         

     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = (matrix.length * matrix[0].length) - 1;

        while (left <= right) {
            int middle = (right + left) / 2;
            // int middleX = middle % matrix.length;
            // int middleY = middle / matrix.length;

            // System.out.println("middles" + middleY +  " " + middleX);
            // System.out.println(matrix[middleY][middleX] + " " +  
middle);
            if (matrix[middle / matrix[0].length][middle % 
matrix[0].length] == target) {
                return true;
            } else if (matrix[middle / matrix[0].length][middle % 
matrix[0].length]  > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}
