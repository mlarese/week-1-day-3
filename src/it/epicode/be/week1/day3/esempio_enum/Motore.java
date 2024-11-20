package it.epicode.be.week1.day3.esempio_enum;

public class Motore {
    public Motore(String tipo) {
        this.tipo = tipo;
    }
    private String tipo ;
    // non si può usare direttamente l'attributo tipo perchè non è statico, devo passare
    // un parametro al metodo statico che può essere di qualunque tipo
    private static void stampa (String tipo) {
        System.out.println( tipo);
    }

    public static void main(String[] args) {
        Motore a = new Motore("2 cil");
        Motore b = new Motore("3 cil");
        stampa(a.tipo);
    }
}
