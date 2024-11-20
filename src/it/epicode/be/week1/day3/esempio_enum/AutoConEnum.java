package it.epicode.be.week1.day3.esempio_enum;

public class AutoConEnum {
    public String descrizione;
    public TipoAutoEnum tipo = TipoAutoEnum.TIPO_CABRIO;

    public String creaDescrizione() {
        return descrizione + tipo;
    }
    public static void main(String[] args) {
        AutoConEnum auto = new AutoConEnum();
        auto.descrizione = "peugeot 407";
        auto.tipo = TipoAutoEnum.TIPO_BERLINA;
    }
}
