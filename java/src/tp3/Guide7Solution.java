package tp3;

import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;

import java.util.Arrays;
import java.util.List;

public class Guide7Solution implements Guide7 {

    @Override
    public int exercise_1_a(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[][] A) {
        int sum = 0;
        for(int i = 0, j= A.length -1 ; i < A.length && j > -1; i++,j--){
            sum += A[j][i];
        }
        return sum;
    }

    @Override
    public int[] exercise_1_c(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_d(int[][] A, int[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_e(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_f(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_g(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_h(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int exercise_1_i(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int[][] exercise_1_j(int[][] A, int c) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean exercise_2_a(int[][] A) {
        for(int i = 0, a = A[0][0] ; i < A.length ; i++){
            for(int j = 0; j < A.length; j++){
                if(!(A[i][j] == A[j][i])){
                    return false;
                }
            }
            if(a != A[i][i]){
                return false;
            }
        }
        return true;
    }
    private int module(int a ){
        if(a > 0){
            return a;
        }
        else
            return a * (-1);

    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        for(int i=0; i< A.length;i++){
            int sum = 0;
            for(int j=0; j<A.length;j++){
                if(i!=j){
                    sum+= module(A[i][j]);
                }
            }
            if(module(A[i][i]) < sum){
                return false;
            }
        }
        return true;
    }

    @Override
    public MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op) {
        int[][] matrix = new int[op.getMatrix1().getRows()][op.getMatrix1().getColumns()];
        Matrix sumOfMatrices = new Matrix(matrix);
        for (int i = 0; i <op.getMatrix1().getRows() ; i++) {
            for (int j = i; j < op.getMatrix1().getColumns(); j++) {
                matrix[i][j] = op.getMatrix1().getValue(i,j) + op.getMatrix2().getValue(i,j);
            }
        }
        op.setResult(sumOfMatrices);
        return op;
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_c_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_d_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_e(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    public double lambdaCalculator(double[] a1, double[] a2){
        double result = 0;
        double divisor = 0;
        for(int i=0; i<a1.length;i++){
            result+= (a1[i] * a2[i]);
            divisor += (a2[i] * a2[i]);
        }
        result = -(result/divisor);
        return result;
    }


    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        double[][] a = new double[A.size()][];
        a[0] = A.get(0);
        for(int i= 1; i < A.size(); i++){
            double[] r = A.get(i);
            a[i] = r;
            for(int j=0; j<=i-1; j++) {
                double[] aux = new double[A.get(0).length];
                double lambda = lambdaCalculator(a[i], a[j]);
                for (int k = 0; k < r.length; k++) {
                    aux[k] = a[j][k] * lambda;
                }
            for(int t= 0; t< aux.length; t++){
                a[i][t] += aux[t];
            }
            }

        }
        return Arrays.stream(a).toList();

    }
}
