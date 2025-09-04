package Tasks;

import java.util.Scanner;

public class Task6 {
    public Task6() {

    }
    public void RunTask() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę i zwróć pierwiastek kwadraotowy z tej liczby");
        int a = sc.nextInt();

        System.out.println("Pierwiastek kwadratow z podanej liczby wynosi : " + Math.sqrt(a));

    }
}
