public class TaskTwo {
    //TODO Задача 2: Нахождение ошибки в программе
    // Вам предоставлена некорректная Java-программа, и ваша задача -
    // найти и исправить ошибку с помощью отладки (debugging).

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { // Цикл заходил за границу массива
            sum += numbers[i];
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
