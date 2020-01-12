package openfly.org.enjoy.coding.google.easy.tao;

import openfly.org.enjoy.coding.utils.Tuple3;

import java.util.Arrays;
import java.util.List;

import static openfly.org.enjoy.coding.utils.Println.println;
import static org.junit.Assert.*;

public class C0844BackspaceStringCompareTest {

    @org.junit.Test
    public void backspaceCompare() {

        List<Tuple3<String, String, Boolean>> testData = Arrays.asList(
                new Tuple3<String, String, Boolean>("ab#c", "ad#c", true)
                , new Tuple3<String, String, Boolean>("ab##", "c#d#", true)
                , new Tuple3<String, String, Boolean>("a##c", "#a#c", true)
                , new Tuple3<String, String, Boolean>("a#c", "b", false)
                , new Tuple3<String, String, Boolean>("", "", true)
                , new Tuple3<String, String, Boolean>("", "#c#", true)
                , new Tuple3<String, String, Boolean>("xywrrmp", "xywrrm#p", false)



        );

        C0844BackspaceStringCompare to = new C0844BackspaceStringCompare();

        for (Tuple3<String, String, Boolean> t : testData) {
            println(t._1+":"+t._2);
            assertEquals(t._3, to.backspaceCompare(t._1, t._2));
        }
    }
}