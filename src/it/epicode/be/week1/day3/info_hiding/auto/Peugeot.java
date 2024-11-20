package it.epicode.be.week1.day3.info_hiding.auto;

// esempio di visibilità degli attributi
// questa classe si trova nello stesso package della sua classe padre per cui eredita anche gli attributi protected e package friendly
public class Peugeot extends  Auto{
    public static void main(String[] args) {
        Peugeot p = new Peugeot();
        p.tipo = "";
        p.cilindrata = 2000;
        p.numeroPistoni = 3 ;
    }
}
