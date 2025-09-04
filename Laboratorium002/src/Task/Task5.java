package Task;

import java.util.Scanner;

public class Task5 {
    public Task5() {

    }
    public void RunTask() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj słowo które chcesz sprawdzić");
        String sprawdz = sc.nextLine();

        boolean palindorm = true;


        for(int i = 0 ; i < sprawdz.length() / 2 ; i++){


                if(sprawdz.charAt(i) != sprawdz.charAt(sprawdz.length() - 1 - i)){
                    palindorm = false;
                    break;
                }

        }

        System.out.println("Czy podane słowo jest palinfromem ? " + palindorm );
    }
}
