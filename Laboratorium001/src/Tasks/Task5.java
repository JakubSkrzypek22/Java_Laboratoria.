package Tasks;

import java.util.Scanner;

public class Task5 {
    public Task5(){

    }
    public void RunTask(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe i podnieś ją do 3 potęgi");
        int a =  scan.nextInt();

        System.out.println("Podana liczba podniesiona do trzeciej potegi wynosi : " + (a*a*a));
    }
}
