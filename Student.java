import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smady91 on 27.04.2017.
 */
public class Student extends Person {
    private static List<Student>  studentList = new ArrayList<Student>(3);
    private String Matrikelnummer;
    private int Seminargruppe;
    List<Fach> fachList = new ArrayList<Fach>(4);

    public Student (String FName,String VName,int Gdatum,String MNummer,int SGruppe,List<Fach> fList ){
        super(FName,VName,Gdatum);
        Matrikelnummer = MNummer;
        Seminargruppe = SGruppe;
        fachList = fList;

    };

    public String getMatrikelnummer() {
        return Matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        Matrikelnummer = matrikelnummer;
    }

    public int getSeminargruppe() {
        return Seminargruppe;
    }

    public void setSeminargruppe(int seminargruppe) {
        Seminargruppe = seminargruppe;
    }

    public List<Fach> getFachList() {
        return fachList;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }


    @Override
    public String toString() {
        String s ="Familienname: " + getFamilienname() + " ,Vorname: " + getVorname() + " ,Geburtsdatum: " + getGeburtsdatum() + " ,Matrikelnummer = " + getMatrikelnummer() + " ,Seminar Gruppe = " + getSeminargruppe() ;
        int i = 1;
        for(Fach f : getFachList()){
           s = s + "\n" +"Fach"+i+": "+ f.toString();
           i++;
       }
        s = s + "\n";
        return s;

    }
}
