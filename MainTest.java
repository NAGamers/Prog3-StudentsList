import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Smady91 on 28.04.2017.
 */
public class MainTest {
    @Test
    public void add() throws Exception {
        List<Fach> flist = new ArrayList<Fach>(4);
        flist.add(new Fach(1,1,1));
        flist.add(new Fach(2,2,2));
        Student s1 = new Student("SMADI","Nabeel",1991,"0556209",2,flist);
    }



    @Test
    public void readAll() throws Exception {
    }



}