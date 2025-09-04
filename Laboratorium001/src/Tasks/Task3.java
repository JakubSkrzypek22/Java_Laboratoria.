package Tasks;

import java.util.Scanner;

public class Task3 {
    public Task3() {

    }

    public void RunTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę i sprawdź czy jest parzysta ");
        int a =  sc.nextInt();

        boolean parzysta = a % 2 == 0;
        System.out.println(parzysta);
    }
}
