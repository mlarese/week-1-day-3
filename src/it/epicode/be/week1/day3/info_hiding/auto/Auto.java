package it.epicode.be.week1.day3.info_hiding.auto;

public class Auto {
    // non verrà visto da nessuna classe neanche in quelle estese
    private String descrizione;
   // verrà vista da qualunque classe
    public String tipo;

    // verrà vista solo dalle classi nelle stesso package anche se estese
    int cilindrata;

    // verrà vista solo dalle classi dello stesso package oppure da quelle estese anche in altri package
    protected  int numeroPistoni;
}
