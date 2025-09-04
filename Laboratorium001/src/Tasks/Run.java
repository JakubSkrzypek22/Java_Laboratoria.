package Tasks;

import java.util.Scanner;

public class Run {
    public Run(){

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("Wybierz zadanie");
            System.out.println("Zadanie.1");
            System.out.println("Zadanie.2");
            System.out.println("Zadanie.3");
            System.out.println("Zadanie.4");
            System.out.println("Zadanie.5");
            System.out.println("Zadanie.6");
            System.out.println("Zadanie.7");
            System.out.println("Wyjście.8");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    new Task1().RunTask();
                    break;
                case 2:
                    new Task2().RunTask();
                    break;
                case 3:
                    new Task3().RunTask();
                    break;
                case 4:
                    new Task4().RunTask();
                    break;
                case 5:
                    new Task5().RunTask();
                    break;
                case 6:
                    new Task6().RunTask();
                    break;
                case 7:
                    new Task7().RunTask();
                    break;
                case 8:
                    System.out.println("Koniec Pracy Programu");
                    exit = true;
                    break;
                default:
                    System.out.println("Wybrano nieporpawdną opcję ");
            }


        }
        sc.close();

    }
}
