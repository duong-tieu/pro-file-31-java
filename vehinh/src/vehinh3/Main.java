package vehinh3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i = hight; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}