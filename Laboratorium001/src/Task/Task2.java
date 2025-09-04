package Task;

import java.util.Scanner;

public class Task2 {
    public Task2(){

    }
    public void RunTask(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę ");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę ");
        int b = scanner.nextInt();

        System.out.println("Suma podanych liczb wynosi " + (a+b));
        System.out.println("Różnica podanych liczb wynosi " + (a-b));
        System.out.println("Iloraz podanych liczb wynosi " + (a*b));
    }
}
