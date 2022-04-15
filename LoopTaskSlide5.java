public class LoopTaskSlide5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 333; i++) {
            if (i % 100 == 0 || i % 10 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
