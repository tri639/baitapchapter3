public class bai18 {
    public static void main(String[] args) {
        int term = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(term + " ");
            term += 6 * i - 1;
        }
    }
}
