package katas;

public class Kate2 {
    public static boolean div(int n) {
        boolean primo = true;     //suponemos que el número es primo
        if (n < 2) {    //primer primo es 2
            primo = false;
        }
        for (int i=2; i<n; i++) { //y se cumplan las dos condiciones
            if (n % i == 0) {     // si n es divisible por i , resto de la division
                primo = false;    //entonces no es un número primo
            }
            i++;
        }

        return (primo);
    }
}