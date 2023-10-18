// Реализуйте метод divArrays, принимающий в качестве аргументов 
// два целочисленных массива a и b, и возвращающий новый массив с, 
// каждый элемент которого равен частному элементов двух входящих 
// массивов в той же ячейке.
// Если длины массивов не равны - верните нулевой массив длины 1.
// Важно: При выполнении метода единственное исключение, которое 
// пользователь может увидеть - RuntimeException, т.е. ваше.


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {6, 9, 4};
        int[] b = {3, 3, 2};
        int[] res = divArrays(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] divArrays(int[] a, int[] b) {
        if (a.length == b.length) {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0) {
                    throw new RuntimeException("На ноль делить нельзя!");
                }
                c[i] = a[i] / b[i];
            }
            return c;
        } else {
            int[] c = new int[1];
            c[0] = 0;
            return c;
        }
    }
}

