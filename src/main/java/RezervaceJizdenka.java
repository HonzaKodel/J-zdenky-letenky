import java.util.Date;

public class RezervaceJizdenka extends Rezervace {

    private typProstredku Prostredek;
    private String sedadlo;
    private String datumOdjezdu;
    private String odjezdoveStanoviste;
    private String odjezdDopravnihoprostredku;

    public RezervaceJizdenka(String datum, String osoba, String vytvoreno, typProstredku prostredek, String sedadlo, String odjezdoveStanoviste, String odjezdDopravnihoprostredku) {

        super(datum, osoba, vytvoreno);

        this.setProstredek(prostredek);
        this.setSedadlo(sedadlo);
        this.setOdjezdoveStanoviste(odjezdoveStanoviste);
    }

    public typProstredku getProstredek() {
        return Prostredek;
    }

    public void setProstredek(typProstredku prostredek) {
        Prostredek = prostredek;
    }

    public String getSedadlo() {
        return sedadlo;
    }

    public void setSedadlo(String sedadlo) {
        this.sedadlo = sedadlo;
    }

    public String getDatumOdjezdu() {
        return datumOdjezdu;
    }

    public void setDatumOdjezdu(String datumOdjezdu) {
        this.datumOdjezdu = datumOdjezdu;
    }

    public String getOdjezdoveStanoviste() {
        return odjezdoveStanoviste;
    }

    public void setOdjezdoveStanoviste(String odjezdoveStanoviste) {
        this.odjezdoveStanoviste = odjezdoveStanoviste;
    }

    public String getOdjezdDopravnihoprostredku() {
        return odjezdDopravnihoprostredku;
    }

    public void setOdjezdDopravnihoprostredku(String odjezdDopravnihoprostredku) {
        this.odjezdDopravnihoprostredku = odjezdDopravnihoprostredku;
    }
}
