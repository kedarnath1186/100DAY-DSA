class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // i for row, j for column
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {

                // Save top-left in temp
                int temp = matrix[n - 1 - j][i];

                // bottom-left -> top-left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];

                // bottom-right -> bottom-left
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                // top-right -> bottom-right
                matrix[j][n - 1 - i] = matrix[i][j];

                // temp -> top-right
                matrix[i][j] = temp;
            }
        }
    }
}
