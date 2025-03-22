public class TaskThree {
    //TODO Задача 3: Нахождение ошибки в методе

    public static void main(String[] args) {
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }
    public static int computeFactorial(int n) {
        if (n == 0 || n == 1) { // (n == 2) Ошибка факториал должен считаться от 1 до n
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
