// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
// Метод divisionByZero - Деление на 0
// Метод numberFormatException - Ошибка преобразования строки в число
// Важно: они не должны принимать никаких аргументов

public class Task1 {
    public static void main(String[] args) {
        // arrayOutOfBoundsException();
        // divisionByZero();
        numberFormatException();
    }

    public static void arrayOutOfBoundsException() {
        int[] array = {11, 2, 43};
        System.out.println(array[3]);
    }

    public static void divisionByZero() {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }

    public static void numberFormatException() {
      String numberString = "Привет";
      int number = Integer.parseInt(numberString);
      System.out.println(number);
    }
}
