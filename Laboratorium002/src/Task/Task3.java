package Task;

import java.util.Scanner;

public class Task3 {
    public Task3(){

    }
    public void RunTask(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe (N) ciągu");
        int n = scan.nextInt();

        int suma = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Podaj " + (i + 1) + " liczbe ciągu " );
            int liczba = scan.nextInt();

            if(liczba % 2 == 0){
                suma += liczba;
            }
        }
        System.out.println("Suma wszystkich liczb parzystych tego ciągu jest równa " + suma);
    }
}
