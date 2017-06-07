/**
 * Created by Smady91 on 27.04.2017.
 */
public class Fach implements Moodle{
    private int semester ;
    private int kursNum ;
    KursNameList.kursName kursName;
    private int studiengangNum ;
    StudiengangList.studiengangName studiengangName;

    public Fach (){};
    public Fach (int s , int kurs, int studiengang){
        semester = s;
        kursNum = kurs;
        studiengangNum = studiengang;
    };
    public Fach (Fach f){
        semester = f.getSemester();
        kursNum = f.getKursNum();
        studiengangNum = f.getStudiengangNum();
    };

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getKursNum() {
        return kursNum;
    }

    public void setKursNum(int kursNum) {
        this.kursNum = kursNum;
    }

    public int getStudiengangNum() {
        return studiengangNum;
    }

    public void setStudiengangNum(int studiengangNum) {
        this.studiengangNum = studiengangNum;
    }

    private String getKursName (){
        switch (kursNum){
            case 1: kursName = KursNameList.kursName.kursName1;
                break;
            case 2: kursName = KursNameList.kursName.kursName2;
                break;
            case 3: kursName = KursNameList.kursName.kursName3;
                break;
            case 4: kursName = KursNameList.kursName.kursName4;
                break;
            case 5: kursName = KursNameList.kursName.kursName5;
                break;
            default: kursName = KursNameList.kursName.kursName1;
                break;
        }
        return kursName.getKursName();
    }

    public static void showKursNames (){
        for(int i=1;i<=5;i++){
            switch (i){
                case 1:System.out.println(i+":"+KursNameList.kursName.kursName1.getKursName());
                    break;
                case 2: System.out.println(i+":"+KursNameList.kursName.kursName2.getKursName());
                    break;
                case 3: System.out.println(i+":"+KursNameList.kursName.kursName3.getKursName());
                    break;
                case 4: System.out.println(i+":"+KursNameList.kursName.kursName4.getKursName());
                    break;
                case 5: System.out.println(i+":"+KursNameList.kursName.kursName5.getKursName());
                    break;
                default: System.out.println(i+":"+KursNameList.kursName.kursName1.getKursName());
                    break;
            }
        }
    }



    private String getStudiengangName (){
        switch (studiengangNum){
            case 1: studiengangName = StudiengangList.studiengangName.studiengangList1;
                break;
            case 2: studiengangName = StudiengangList.studiengangName.studiengangList2;
                break;
            case 3: studiengangName = StudiengangList.studiengangName.studiengangList3;
                break;
            case 4: studiengangName = StudiengangList.studiengangName.studiengangList4;
                break;
            case 5: studiengangName = StudiengangList.studiengangName.studiengangList5;
                break;
            default: studiengangName = StudiengangList.studiengangName.studiengangList1;
                break;
        }
        return studiengangName.getStudiengangName();
    }

    public static void showStudiengangNames (){
        for(int i=1;i<=5;i++){
            switch (i){
                case 1:System.out.println(i+":"+StudiengangList.studiengangName.studiengangList1.getStudiengangName());
                    break;
                case 2: System.out.println(i+":"+StudiengangList.studiengangName.studiengangList2.getStudiengangName());
                    break;
                case 3: System.out.println(i+":"+StudiengangList.studiengangName.studiengangList3.getStudiengangName());
                    break;
                case 4: System.out.println(i+":"+StudiengangList.studiengangName.studiengangList4.getStudiengangName());
                    break;
                case 5: System.out.println(i+":"+StudiengangList.studiengangName.studiengangList5.getStudiengangName());
                    break;
                default: System.out.println(i+":"+StudiengangList.studiengangName.studiengangList1.getStudiengangName());
                    break;
            }
        }
    }

    public String toString (){
       return "Semster: " + getSemester() + " ,KursName: " + getKursName() + " StudiengangName: " + getStudiengangName();
    }
}
