public class RezervaceJizdenka extends Rezervace{

    private typProstredku Prostredek;
    private String sedadlo;
    private String datum;
    private String odjezdoveStanoviste;
    private String odjezdDopravnihoprostredku;

    public RezervaceJizdenka(String datum, String osoba, String datumVytvoreni, typProstredku prostredek, String sedadlo, String odjezdoveStanoviste, String odjezdDopravnihoprostredku) {

        super(datum, osoba, datumVytvoreni);

        this.setProstredek(prostredek);
        this.setSedadlo(sedadlo);
        this.setOdjezdoveStanoviste(odjezdoveStanoviste);
        this.setOdjezdDopravnihoprostredku(odjezdDopravnihoprostredku);
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

    @Override
    public String getDatum() {
        return datum;
    }

    @Override
    public void setDatum(String datum) {
        this.datum = datum;
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
