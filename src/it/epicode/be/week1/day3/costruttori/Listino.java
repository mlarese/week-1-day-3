package it.epicode.be.week1.day3.costruttori;

public class Listino {
    public static void main(String[] args) {
        // posso richiamare una variabile o un metodo senza fare un istanza di una classe
        // definendoli static
        // per usarli scrivo il nome della classe . il metodo o l'attributo statico
        System.out.println(Pizza.NOME_PIZZERIA);
        Pizza.stampaPizza(null);

        Pizza margherita = new Pizza();
        Pizza diavola = new Pizza();


        System.out.println("Margherita "+ margherita.VALORE_COMUNE);
        System.out.println("Diavola "+diavola.VALORE_COMUNE);

        // cambio la variabile statica dando un valore differente
        margherita.VALORE_COMUNE = 7;

        // viene stampato per entrambe le classi il valore 7 perchè un attributo static
        // è condiviso tra tutte le istanze

        System.out.println("Margherita 1 "+ margherita.VALORE_COMUNE);
        System.out.println("Diavola 1 "+diavola.VALORE_COMUNE);
    }
}
