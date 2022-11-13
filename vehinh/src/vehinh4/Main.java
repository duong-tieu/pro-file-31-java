package vehinh4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.printf("\n\nNhập chiều cao: ");
    int hight, k =0;
    hight= scanner.nextInt();
    for (int i = 1; i <= hight ; ++i, k = 0 ) {
           for(int j = 1; j <= hight - i ; ++j) {
            System.out.print(" ");
        }
        while (k != 2*i-1 ){
            System.out.print("*");
            ++k;
        }
        System.out.println();
    }
    }
}
