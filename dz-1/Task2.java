import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        
        double y = Math.exp(x * x) + Math.sqrt(4 * x / 8);
        System.out.println("Результат: y = " + y);
        
        scanner.close();
    }
}
