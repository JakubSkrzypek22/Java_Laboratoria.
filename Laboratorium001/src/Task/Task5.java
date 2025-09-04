package Task;

import java.util.Scanner;

public class Task5 {
    public Task5(){

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe ");
        int a = sc.nextInt();

        System.out.println("Podana liczba podniesiona do 3 potęgi wynosi : " + (a*a*a));
    }
}
