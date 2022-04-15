import java.util.Scanner;

public class LoopTaskSlide8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Рыбий хвост, но он – не рыба. Пасть – с клыками, но не зверь");
        for (int i = 0; i < 3; i++) {
            String answer = scanner.nextLine();
            switch (answer) {
                case "крокодил":
                    System.out.println("Правильно!");
                    i = 3;
                    break;
                case "сдаюсь":
                    System.out.println("Правильный ответ - крокодил.");
                    i = 3;
                    break;
                default:
                    if (i == 2) {
                        System.out.println("Ты проиграл. Правильный ответ - крокодил.");
                    } else {
                        System.out.println("Подумай ещё");
                    }
            }
        }
    }
}
