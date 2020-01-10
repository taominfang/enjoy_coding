package openfly.org.enjoy.coding.example;


import static openfly.org.enjoy.coding.utils.Println.println;

public class Example {

    public static void main(String[] argv) {

        String [] testData={
                "",
                ""
        };
        Example t = new Example();

        for(String one:testData){
            println(one);
            println(t.test(one));
        }

    }

    public String test(String s) {
        return s;
    }


}
