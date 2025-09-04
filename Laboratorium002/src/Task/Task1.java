package Task;

import java.util.Scanner;

public class Task1 {
    public Task1(){

    }
    public void RunTask(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe studentów");
        int n = sc.nextInt();

        int i = 0;
        int suma = 0;

        while(i<n){
            System.out.println("Podaj liczbę punktów " + (i+1) + " studneta ");
            int liczba = sc.nextInt();
            suma += liczba;
            ++i;
        }

        double srednia  = (double)suma/n;
        System.out.println("Średnia liczba punktów w grupie studentów wynosi : " + srednia);

    }
}

