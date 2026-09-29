import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Добро пожаловать в калькулятор Индекса Массы Тела (ИМТ)!
                Мы вычислим ИМТ по очень простой формуле, зная твой рост и вес.
                """);
                
        System.out.print("Введите ваш вес в кг: ");
        double w = scanner.nextDouble();
        System.out.print("Введите ваш рост в см: ");
        double h = scanner.nextDouble();

        if (w <= 0) {
            System.out.println("Ошибка: вес должен быть положительным!");
            scanner.close();
            return;
        }

        if (h <= 0) {
            System.out.println("Ошибка: рост должен быть положительным!");
            scanner.close();
            return;
        }

        if (w > 500) {
            System.out.println("Ошибка: некорректное значение веса (превышает 500 кг)!");
            scanner.close();
            return;
        }

        if (h > 250) {
            System.out.println("Ошибка: некорректное значение роста (превышает 250 см)!");
            scanner.close();
            return;
        }

        double bmi = w / ((h / 100) * (h / 100));

        System.out.println("Ваш ИМТ: " + bmi);
        if (bmi < 18.5) {
            System.out.println("У вас недостаточный вес");
        } else if (bmi < 25) {
            System.out.println("У вас нормальный вес");
        } else {
            System.out.println("У вас избыточный вес");
        }
        
        scanner.close();
    }
}
