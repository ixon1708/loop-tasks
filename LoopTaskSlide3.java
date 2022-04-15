import java.util.Scanner;

public class LoopTaskSlide3 {
    public static void main(String[] args) {
        //первое задание
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        /*
        второй вариант, который иногда показывают ученики
        for (int i = 2; i <= 10; i +=2) {
            System.out.println(i);
        }
        */

        //второе задание
        int number = 1;
        while (number <= 15) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
        /*
        int i = 1;
        while (i <= 15) {
            System.out.println(i);
            i += 2;
        }
        */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            if (i == num) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(sum);
    }
}
