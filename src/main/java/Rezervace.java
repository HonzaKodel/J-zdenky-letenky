import java.util.Date;

abstract public class Rezervace {

    private String datum;
    private String osoba;
    private String vytvoreno;

    public Rezervace(String datum, String osoba, String vytvoreno) {
        this.datum = datum;
        this.osoba = osoba;
        this.vytvoreno = vytvoreno;

    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }

    public String getVytvoreno() {
        return vytvoreno;
    }

    public void setVytvoreno(String vytvoreno) {
        this.vytvoreno = vytvoreno;
    }

    public void systemOutPrint(){
        System.out.println(String.format("%s si objednal dne %s jízdenku s datumem odjezdu %s.", osoba, vytvoreno , datum));
    }
}
