package it.epicode.be.week1.day3.esempio_enum;

public class Automobile {
    public static final String TIPO_SUV= "SUV";
    public static final String TIPO_BERLINA= "BERLINA";
    public static final String TIPO_CABRIO= "CABRIO";


    public String descrizione;
    public String tipo; //


    public static void main(String[] args) {
        Automobile peugeot307cc = new Automobile();
            peugeot307cc.descrizione = "peugeot 307 cabrio";
            peugeot307cc.tipo = TIPO_CABRIO;
    }
}
