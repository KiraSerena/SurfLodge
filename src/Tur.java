import java.time.LocalDate;
import java.time.LocalTime;

public class Tur {
    private int antalPladser;
    private LocalTime afgangsTid;
    private LocalTime ankomstTid;
    private LocalDate afgangsDato;
    private boolean aktivitet =false;
    private int turID=0;

    public Tur(int antalPladser, LocalTime afgangsTid, LocalTime ankomstTid, LocalDate afgangsDato, boolean aktivitet) {
        this.antalPladser = antalPladser;
        this.afgangsTid = afgangsTid;
        this.ankomstTid = ankomstTid;
        this.aktivitet = aktivitet;
        this.afgangsDato = afgangsDato;
        this.turID = 0;
        turID++;
    }
}

