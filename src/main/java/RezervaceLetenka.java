import java.util.Date;

public class RezervaceLetenka extends Rezervace {

    private String let;
    private String sedadlo;
    private String datumOdletu;
    private int pocetPrestupu;

    public RezervaceLetenka(String datum, String osoba, String vytvoreno, String let, String sedadlo, String datumOdletu, int pocetPrestupu) {

        super(datum, osoba, vytvoreno);

        this.setLet(let);
        this.setSedadlo(sedadlo);
        this.setPocetPrestupu(pocetPrestupu);

    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getSedadlo() {
        return sedadlo;
    }

    public void setSedadlo(String sedadlo) {
        this.sedadlo = sedadlo;
    }

    public String getDatumOdletu() {
        return datumOdletu;
    }

    public void setDatumOdletu(String datumOdletu) {
        this.datumOdletu = datumOdletu;
    }

    public int getPocetPrestupu() {
        return pocetPrestupu;
    }

    public void setPocetPrestupu(int pocetPrestupu) {
        this.pocetPrestupu = pocetPrestupu;
    }
}
