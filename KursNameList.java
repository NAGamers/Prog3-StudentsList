/**
 * Created by Smady91 on 27.04.2017.
 */
public class KursNameList {
    public enum kursName {
        kursName1 ("Programmierung1"),
        kursName2 ("Programmierung2"),
        kursName3 ("Programmierung3"),
        kursName4 ("Programmierung4"),
        kursName5 ("Programmierung5");
        private final String name;
        kursName(String kursName){
            name = kursName;
        }
        public String getKursName(){
            return name;
        }
    }
}
