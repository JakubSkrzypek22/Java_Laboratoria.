package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public Task7() {

    }
    public void RunTask(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj pierwszy parametr ");
        int a = sc.nextInt();

        System.out.println("Podaj drugi parametr");
        int b = sc.nextInt();

        int q = random.nextInt(a-b+1) +a;
        int w = random.nextInt(a-b+1) +a;
        int e = random.nextInt(a-b+1) +a;

        System.out.println("Wylosowane liczby to " + q + " " +  w +  " " +  e + " " );

        boolean prostokatny = (q * q + w * w == e*e) ||
                (w * w + q * q == e*e) || (e * e + q * q == w*w) ;

        System.out.println("Trójką stworzony z wylosowanych liczb jest prostokątny  = " + prostokatny);
     }
}
