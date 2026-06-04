class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int column=mat[0].length;
        if (rows*column != r*c) {
            return mat;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < rows*column; i++) {
            result[i/c][i%c] = mat[i/column][i%column];         
        }
        return result;
    }
}
