package Task;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Task3 {
    public Task3(){

    }
    public void RunTask() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę ");
        int a = sc.nextInt();

        boolean parzysta  = a % 2 == 0 ;

        System.out.println("Czy podana liczba jest parzysta ? " + parzysta);

    }
}
