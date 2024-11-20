package it.epicode.be.week1.day3;

public class LoScope {
    /**************************/
    /*   scope di istanza
    /**************************/
    private int numero=10;

    public void mostraNumero() {


        // viene stampato l'attributo numero definito nella classe
        // tutti i metodi vedono questi attributi
        System.out.println(numero);

        for (int i = 0; i < 5; i++) {

            /**************************/
            /*   scope di blocco
            /**************************/

            // la variabile numero è utilizzabile
            // al posto dell'attributo dentro il ciclo for
            int numero = i;
            System.out.println(numero);
        }
        // all'esterno del for ricomincia a valere l'attributo numero
    }

    public void mostraAltroNumero() {
        /**************************/
        /*   scope di metodo
        /**************************/
        // definisco una variabile con lo stesso nome dell'attributo
        // all'interno del metodo la variabile numero viene usata
        // al posto dell'attributo.
        int numero = 20;
        System.out.println(numero);
    }
}
