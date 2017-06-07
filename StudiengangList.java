/**
 * Created by Smady91 on 27.04.2017.
 */
public class StudiengangList {
    public enum studiengangName {
        studiengangList1 ("Informaik1"),
        studiengangList2 ("Informaik2"),
        studiengangList3 ("Informaik3"),
        studiengangList4 ("Informaik4"),
        studiengangList5 ("Informaik5");
        private final String name;
        studiengangName(String studiengangName){
            name = studiengangName;
        }
        public String getStudiengangName(){
            return name;
        }
    }
}
