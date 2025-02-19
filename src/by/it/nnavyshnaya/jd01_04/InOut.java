package by.it.nnavyshnaya.jd01_04;

public class InOut {
    static double[] getArray(String line) {
        //1 2 3 4 5
        String[] strArr = line.split(" ");
        double[] result = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            result[i] = Double.parseDouble(strArr[i]);
        }
        return result;
    }

    static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    static void printArray(double[] array, String name, int columnCount) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, array[i]);
            if ((i + 1) % columnCount == 0 || i + 1 == array.length) ;
            System.out.println();


        }
    }
}
