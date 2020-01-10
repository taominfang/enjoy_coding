package openfly.org.enjoy.coding.example;

import java.util.Arrays;

import static java.lang.String.format;

import static openfly.org.enjoy.coding.utils.Println.print;
import static openfly.org.enjoy.coding.utils.Println.println;

public class InterArrayExample {

    public static void main(String[] argv) {

        int [] [] testData={
                {1,2,3,4,5}
        };
        InterArrayExample t = new InterArrayExample();

        for(int [] one:testData){
            println(format("Original Array:%s", Arrays.toString(one)));
            print("result:");
            println(t.test(one));
        }

    }

    public int test(int [] s) {

        return 0;
    }


}
