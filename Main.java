import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Smady91 on 28.04.2017.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Hauptmenu();
    }

    public static void Hauptmenu() {
        System.out.println("***************");
        System.out.println("*  Hauptmenü  *");
        System.out.println("***************");
        System.out.println("");
        System.out.println("Es stehen folgende operationen zur verfügung:");
        System.out.println("   (1)  addieren");
        System.out.println("   (2)  Alle zeigen");
        System.out.println("   (3)  suche nach Fach");
        System.out.println("");
        System.out.println("   (4)  Programm beenden");
        System.out.println("");
        System.out.println("Was möchten Sie tun:");
        checkint();
        int w = scanner.nextInt();
        switch (w) {
            case 1: add();
                break;
            case 2: ReadAll();
                break;
            case 3: suchf();
                break;
            case 4:
                break;
            default:	System.out.println("Ungültig Eingabe. Nochmal:");
                Hauptmenu();
                break;
        }
    }

    public static void add() {

        System.out.println("Familien Name: ");
        String FName = scanner.next();

        System.out.println("Vorname: ");
        String VName  = scanner.next();

        System.out.println("Geburtsdatum: ");
        int Gdatum = checkintR(1900,2017,true);

        System.out.println("Matrikelnummer: ");
        String MNummer  = scanner.next();

        System.out.println("Seminar Gruppe: ");
        checkint();
        int SGruppe = scanner.nextInt();

        System.out.println("Wie viel Fächer(1 bis 4): ");
        int f = checkintR(1,4,false);
        List<Fach> fList = new ArrayList<Fach>(f);
        for(int i = 1 ;i<=f;i++){
           addFach(fList);
        }
        Student.getStudentList().add(new Student(FName,VName,Gdatum,MNummer,SGruppe,fList));
        System.out.println("");
        Hauptmenu();
    }

    public static void addFach(List<Fach> fList) {
        System.out.println("Semester Nummer : ");
        int semester  = checkintR(1,6,false);

        System.out.println("Kurs Nummer : ");
        Fach.showKursNames();
        int kursNum  = checkintR(1,5,false);

        System.out.println("Studiengang Nummer : ");
        Fach.showStudiengangNames();
        int studiengangNum  = checkintR(1,5,false);

        fList.add(new Fach(semester,kursNum,studiengangNum));
        System.out.println("");

    }

    public static void ReadAll() {
        for(Student s : Student.getStudentList()){
            System.out.println(s.toString());
        }
        Hauptmenu();
    }

    public static void suchf() {
        System.out.println("");
        System.out.println("Kurs Nummer: ");
        Fach.showKursNames();
        int kursNum  = checkintR(1,5,false);
        for(Student s : Student.getStudentList()){
            for(Fach f : s.getFachList()){
                if(kursNum == f.getKursNum()){
                    System.out.println(s.toString());
                    break;
                }
            }
        }
        Hauptmenu();
    }

    public static int checkintR(int start,int end,boolean jahr) {
        checkint();
        int value = scanner.nextInt();

        while (value < start || value > end){
            if (jahr) {
                System.out.println("Bitte geben Sie nur Jahr als Zahlen ein:");
            }else{
                System.out.println("Bitte geben Sie nur Zahlen ein ("+start+" bis "+end+"):");
            }
            return checkintR(start,end,jahr);
        }
        return value;
    }
    public static void checkint() {
        while (!scanner.hasNextInt()) {
            System.out.println("Bitte geben Sie nur Zahlen ein:");
            scanner.next();
        }
    }
}
