package tp2;

import tp2.utils.Infraction;
import tp2.utils.Survey;

import java.util.List;

public class Guide6Solution implements Guide6 {

    @Override
    public int exercise_1_a(int[] a) {
        int sum = 0;
        if (a.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
        }
        return sum;
    }

    @Override
    public int exercise_1_b(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int[] a, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_e(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_g(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_h(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_i(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_j(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_k(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_2(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_3(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] a) {
        for(int i=0; i<a.length;i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += a[j];

                if (j == a.length - 1) {
                    if (sum !=0) {
                        return false;
                    }
                }
            }
            if (sum < 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public List<Integer> exercise_5_a(Infraction[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_5_b(Infraction[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_5_c(Infraction[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }


    @Override
    public int[] exercise_6(int[] infraction) {
        if (infraction.length != 0) {
            int[] a = new int[infraction.length];
            for (int i = 0; i < a.length; i++) {
                int sum = 0;
                for (int j = 0; j <= i; j++) {
                    sum += infraction[j];
                }
                a[i] = sum;
            }
            return a;
        }
        return infraction;
    }

    @Override
    public double exercise_7_a(Survey[] surveys) {
        int counter = 0;
        for(int i=0; i<surveys.length;i++){
            if(surveys[i].sex == 2 && surveys[i].type == 1){
                counter++;
            }
        }
        double final_number = (double)counter/surveys.length;
        return final_number;

    }

    @Override
    public double exercise_7_b(Survey[] surveys) {
        int counter = 0;
        for(int i=0; i<surveys.length;i++){
            counter+=surveys[i].age;
        }
        double num = (double) counter/surveys.length;
        return num;
    }

    @Override
    public int exercise_7_c(Survey[] surveys) {
        int counter = 0;
        for(int i=0; i<surveys.length;i++){
            if(surveys[i].age > 21 && surveys[i].type == 2){
                counter++;
            }
        }
        return counter;
    }
}
