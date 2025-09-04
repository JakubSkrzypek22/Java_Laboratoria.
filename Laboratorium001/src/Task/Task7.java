package Task;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public Task7(){

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj dolną granicę przedziału: ");
        int a = sc.nextInt();

        System.out.println("Podaj górną granicę przedziału: ");
        int b = sc.nextInt();

        int x = rand.nextInt(b - a + 1) + a;
        int y = rand.nextInt(b - a + 1) + a;
        int z = rand.nextInt(b - a + 1) + a;

        System.out.println("Wylosowane liczby: " + x + ", " + y + ", " + z);

        boolean trojkatProstokatny = false;

        if(x*x + y*y == z*z){
            trojkatProstokatny = true;
        } else if(x*x + z*z == y*y){
            trojkatProstokatny = true;
        } else if(y*y + z*z == x*x){
            trojkatProstokatny = true;
        }

        System.out.println("Czy można zbudować trójkąt prostokątny? " + trojkatProstokatny);
    }
}
