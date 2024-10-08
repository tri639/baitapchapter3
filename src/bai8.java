public class bai8 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 100;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
            double average = (double) sum / count;
        System.out.println("Trung binh cong tat ca cac so nguyen tu 1 den 100 la: " + average);
    }
}
