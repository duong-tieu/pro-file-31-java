import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Nhap so number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ( number < 2) {
            System.out.print( number +" is not a prime ");
        } else {
            int a = 2;
            boolean check = true;
            while (a <= Math.sqrt(number) ) {
                if ( number % a == 0) {
                     check = false;
                     break;
                }
                a++;
            }
            if ( check)
                System.out.println(number + "is a prime");
            else
                System.out.println(number + "is not a prime");
        }
    }
}