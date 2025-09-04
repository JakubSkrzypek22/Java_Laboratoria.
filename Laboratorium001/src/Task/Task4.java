package Task;

import java.util.Scanner;

public class Task4 {
    public Task4(){

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe ");
        int a = sc.nextInt();

        boolean podzielna;

        if(a % 3 == 0 && a % 5 == 0){
            podzielna = true;
            System.out.println("Czy podana liczba jest podzielna przez 3 i 5 ? " + podzielna);
        } else{
            podzielna = false;
            System.out.println("CZy podana liczba jest podzielna przez 3 i 5 ? " + podzielna);
        }

    }
}
