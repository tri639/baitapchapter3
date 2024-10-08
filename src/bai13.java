public class bai13 {
    public static void main(String[] args) {
        term(5);
    }
    static void term(int n){
        for ( int i = 1; i < n; i++ ) {
            for ( int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for ( int j = i; j <= n; j++){
                System.out.print("* ");
            }
            for ( int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( int i = 1 + 2; i <= n; i++ ) {
            for ( int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for ( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for ( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}