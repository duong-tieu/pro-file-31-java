package vehinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng :");
        System.out.println("nhập số cột:");
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        for ( int i = 0; i < m; i++ ){
            for ( int j = 0;j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}