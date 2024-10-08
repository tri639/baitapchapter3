public class bai14 {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int n = 1; n <= rows - i; n++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}