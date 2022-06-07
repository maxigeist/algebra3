package tp3;

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
        throw new UnsupportedOperationException("TODO");
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
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
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
