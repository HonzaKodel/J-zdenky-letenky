import java.util.Date;

abstract public class Rezervace {

    private String osoba;
    private Date datum;
    private Date vytvoreno;

    public Rezervace(Date datum, String osoba, Date vytvoreno) {
        this.osoba = osoba;
    }

    public void systemOutPrint(){
        System.out.println(String.format("%s si objednal dne %s jízdenku s datumem odjezdu %s.", osoba, , datum ));
    }



    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }


}
