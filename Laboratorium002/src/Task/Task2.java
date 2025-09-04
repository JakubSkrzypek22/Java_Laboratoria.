package Task;

import java.util.Scanner;

public class Task2 {
    public Task2() {

    }
    public void RunTask(){
    
        Scanner sc = new Scanner(System.in);
        
        int iloscDodatnich =0 , sumaDodatnich = 0;
        int iloscUjemnych =0 , sumaUjemnych = 0;
        
        for(int i =0 ; i <10 ; i++){
            System.out.println("Podaj " + (i +1 ) + " liczbe " );
            int liczba = sc.nextInt();
            
            if(liczba > 0){
                iloscDodatnich++;
                sumaDodatnich += liczba;
            } else if (liczba < 0) {
                iloscUjemnych++;
                sumaUjemnych += liczba;
            }
        }
        System.out.println("Suma liczb dodatnich wynosi: " + sumaDodatnich + " a ich ilość jest równa " + iloscDodatnich);
        System.out.println("Suma liczb ujemnych wynosi: " + sumaUjemnych + " a ich ilość jest równa " +  iloscUjemnych );
    }
}
