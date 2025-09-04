package Task;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public Task4() {

    }
    public void RunTask() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj liczbe (n) którą chcesz wylosować z przedziału (-10,45)");
        int n = sc.nextInt();

        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println( (i+1 ) + " wylosowana liczba  to : "  );
            int wylosowana = rand.nextInt(56) -10 ;
            System.out.println( wylosowana );

            if(wylosowana % 2 == 0) {
                suma += wylosowana;
            }
        }

        System.out.println("Suma wszystkich wylosowanych liczb parzystych jest równa " + suma);

    }
}
