package by.it.nnavyshnaya.jd01_04;

public class Helper<swap> {
    static double findMax(double[] array) {
        double[] findMax = new double[]{1.342, 34.45, 56.34, 23.45};
        if (0 == array.length) {
            return Integer.MAX_VALUE;
        } else {
            double max = array[0];
            for (double m : array) {
                if (max < m) max = m;
            }
            return max;
        }
    }

    static double findMin(double[] array) {
        double[] findMin = new double[]{1.342, 34.45, 56.34, 23.45};
        if (0 == array.length) {
            return Integer.MIN_VALUE;
        } else {
            double min = array[0];
            for (double m : array) {
                if (min > m) min = m;
            }
            return min;
        }
    }


    static void sort(double[] array) {
        boolean swap;
        double last = array.length - 1;
        do {
            swap = false;
            for (int j = 0; j < last; j++) {
                if (array[j] > array[j + 1]) {
                    double buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    swap = true;
                }
            }
            last--;
        }
        while (swap);
    }
}