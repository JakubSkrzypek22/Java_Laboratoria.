package Tasks;

import java.util.Scanner;

public class Task2 {
    public Task2() {

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę ");
        int a = sc.nextInt();

        System.out.println("Podaj drugą liczbę ");
        int b = sc.nextInt();

        System.out.println("Suma tych liczb wynosi " + (a+b));
        System.out.println("Różnica tych liczb wynosi " + (a-b));
        System.out.println("Iloczyn tych liczb wynosi " + (a*b));
    }
}
