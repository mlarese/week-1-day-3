package it.epicode.be.week1.day3.costruttori;

import java.util.Objects;

public class Pizza {
    public static final String NOME_PIZZERIA = "Vesuvio";
    public static int VALORE_COMUNE = 1;
    private String descrizione;
    private String ingredienti;
    private String allergeni;
    private float prezzo;

    // costruttore con tutti gli attributi
    public Pizza(String descrizione, String ingredienti, float prezzo) {
        // la parola chiave this indica l'istanza della classe e consente di specificare
        // dopo il punto un attributo o un metodo della classe stessa

        this.descrizione = descrizione;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
    }

    public Pizza(String descrizione, String ingredienti, String allergeni, float prezzo) {
        this.descrizione = descrizione;
        this.ingredienti = ingredienti;
        this.allergeni = allergeni;
        this.prezzo = prezzo;
    }

    public Pizza(String descrizione, String ingredienti, String allergeni) {
        this.descrizione = descrizione;
        this.ingredienti = ingredienti;
        this.allergeni = allergeni;
    }

    public Pizza(String descrizione) {
        this.descrizione = descrizione;
    }

    // costruttore vuoto se non esistono altri costruttori
    // viene aggiunto automaticamente
    public Pizza() {
    }

    public static void main(String[] args) {
        // la variabile margherita viene memorizzata nella cella di memoria 2300
        Pizza margherita = new Pizza();
        Pizza diavola = new Pizza("Margherita");
        // dei due costruttori con 3 parametri viesne scelto quello con i tipi corrispondenti
        // per cui visto che il terzo parametro è float viene scelto il costruttore con float al terzo posto
        Pizza greca = new Pizza("Greca","Olive",10);

        // passa la cella di memoria che contiene margherita
        // quello che noi passiamo è un riferimento
        stampaPizza(margherita /*2300*/);

        Pizza pizzaCorrente = margherita;
        pizzaCorrente = null;
        // margherita = null;

        margherita = new Pizza();

    }

    public static void stampaPizza(Pizza pizzaDaStampare) {
        System.out.println(pizzaDaStampare);
    }

    public static void comparaPizze() {
        Pizza margherita = new Pizza("Margherita","mozzarella pomodoro","nessuno", 5);
        Pizza margheritaSbagliata = new Pizza("Margherita","mozzarella pomodoro","nessuno", 5);


        System.out.println(margherita==margheritaSbagliata);
        System.out.println("----------------------");

        if(margherita.equals(margheritaSbagliata)) {
            System.out.println("Uguali");
        }
        System.out.println(margherita.equals(margheritaSbagliata));
        System.out.println("margherita");
    }
    @Override
    // funzione creata da noi per comparare oggetti pizza diversi
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return  Objects.equals(descrizione, pizza.descrizione) && Objects.equals(ingredienti, pizza.ingredienti) && Objects.equals(allergeni, pizza.allergeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descrizione, ingredienti, allergeni, prezzo);
    }
}


