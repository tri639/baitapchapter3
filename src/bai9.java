public class bai9 {
    public static void main(String[] args) {

        int maxNumber = 0;
        for (int i = 1; i <= 100; i ++) {
            if (i % 7 == 0 && i > maxNumber) {
                maxNumber = i;
            }
        }
        System.out.println("So lon nhat chia het cho 7 trong cac so tu 1 den 100 la: " + maxNumber);
    }
}
