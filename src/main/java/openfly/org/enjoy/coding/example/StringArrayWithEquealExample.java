package openfly.org.enjoy.coding.example;


import static openfly.org.enjoy.coding.utils.Println.printf;
import static openfly.org.enjoy.coding.utils.Println.println;

public class StringArrayWithEquealExample {

    public static void main(String[] argv) {

        String [] testData={
                "abc",
                "abc"
        };
        StringArrayWithEquealExample t = new StringArrayWithEquealExample();

        for(int i1=0;i1<testData.length;i1+=2){
            String one=testData[i1];
            String result=testData[i1+1];
            println(one);
            String re=t.test(one);
            if(!result.equals(re)){
                printf("repect [%s] \nbut get[%s]\n",result,re);
            }
            else{
                println("result meet respect:"+re);
            }
        }

    }

    public String test(String s) {
        return s;
    }


}
