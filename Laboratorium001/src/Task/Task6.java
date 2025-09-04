package Task;

import java.util.Scanner;

public class Task6 {
    public Task6(){

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe ");
        int a = sc.nextInt();

        System.out.println("Podana liczba podniesiona do pierwiastka kwadratowego wynosi: " + Math.sqrt(a));
    }
}
