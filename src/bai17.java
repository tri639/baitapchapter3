public class bai17 {
    public static void main(String[] args) {
        int term = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(term + " ");
            term = 2 * term + 1;
        }
    }
}