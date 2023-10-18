// Реализуйте метод subArrays, принимающий в качестве аргументов два 
// целочисленных массива a и b, и возвращающий новый массив c, каждый 
// элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны - верните нулевой массив длины 1.


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {6, 9, 10};
        int[] b = {3, 3, 2};
        int[] res = subArrays(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] subArrays(int[] a, int[] b) {
        if (a.length == b.length) {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        } else {
            int[] c = new int[1];
            c[0] = 0;
            return c;
        }
    }
}
