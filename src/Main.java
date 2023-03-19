import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ответь на загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner input = new Scanner(System.in);
        int attempt = 0;
        int maxAttempt = 2;
        while (attempt <= maxAttempt) {
            String answer = input.nextLine();
            switch (answer.toLowerCase()) {
                case "подсказка":
                    if (attempt == 0) {
                        System.out.println("Это точно не лук! Подумай ещё!");
                        attempt = 2;
                        continue;
                    } else {
                        System.out.println("Подсказка уже недоступна");
                        break;
                    }
                case "заархивированный вирус":
                    System.out.println("Правильно!");
                    attempt = 4;
                    break;
                default:
                    if (attempt == maxAttempt) {
                        System.out.println("Обидно, приходи в другой раз");
                        attempt = 4;
                        break;
                    }
                    System.out.println("Подумай еще!");
                    attempt++;
            }
        }
    }
}