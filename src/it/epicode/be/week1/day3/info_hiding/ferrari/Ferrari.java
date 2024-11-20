package it.epicode.be.week1.day3.info_hiding.ferrari;

import it.epicode.be.week1.day3.info_hiding.auto.Auto;


// esempio di visibilità degli attributi
// questa classe si trova in un package diverso da quello della sua classe padre per cui eredita solo gli attributi protected

public class Ferrari  extends Auto {
    public static void main(String[] args) {
        Ferrari f = new Ferrari();
        // ferrari vede solo i seguenti attributi perchè è una classe estesa di Auto e quindi eredita
        // tipo in quanto public
        // numeroPistoni inquanto protected
        f.tipo = "";
        f.numeroPistoni=3;
    }
}
