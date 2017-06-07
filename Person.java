/**
 * Created by Smady91 on 27.04.2017.
 */
public abstract class Person {
    private String Familienname;
    private String Vorname;
    private int Geburtsdatum;


    public Person(String FName, String VName, int GDatum) {
        Familienname = FName;
        Vorname = VName;
        Geburtsdatum = GDatum;
    }

    ;

    public String getFamilienname() {
        return Familienname;
    }

    public void setFamilienname(String familienname) {
        Familienname = familienname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public int getGeburtsdatum() {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(int geburtsdatum) {
        Geburtsdatum = geburtsdatum;
    }
}
