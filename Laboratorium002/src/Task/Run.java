package Task;

import java.util.Scanner;

public class Run {
    public Run(){

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("Wybierz Zadanie");
            System.out.println("Zadanie.1");
            System.out.println("Zadanie.2");
            System.out.println("Zadanie.3");
            System.out.println("Zadanie.4");
            System.out.println("Zadanie.5");
            System.out.println("Wyjście.6");

            int choice  = sc.nextInt();
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
                    System.out.println("Zkończenie pracy programu");
                    exit = true;
                    break;
                default:
                    System.out.println("Wybrano nieporawną opcje");
            }
        }
        sc.close();
    }
}
