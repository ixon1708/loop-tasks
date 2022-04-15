public class LoopTaskSlide6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 100 == 33) {
                System.out.println("Подарок " + i + " надо исправить!");
            }
        }
    }
}
