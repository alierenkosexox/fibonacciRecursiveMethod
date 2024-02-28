
// Ali Eren KÖSE 28/02/2024 02:41

import java.util.Scanner;

public class Main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
       return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci için N sayısı giriniz : ");
        int n = input.nextInt();
        System.out.println(n + " sayısının Fibonacci karşılığı : " +fib(n)+"'dir ." );
    }
}