package Tasks;

import java.util.Scanner;

public class Task4 {
    public Task4(){

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę i sprawdź czy jest podzielna przez 3 i 5");
        int a = sc.nextInt();

        boolean podzielna = a % 3 == 0 && a % 5 == 0;
        System.out.println(podzielna);
    }
}
