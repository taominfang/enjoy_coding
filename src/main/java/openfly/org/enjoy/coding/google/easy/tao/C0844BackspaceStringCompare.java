package openfly.org.enjoy.coding.google.easy.tao;

import openfly.org.enjoy.coding.utils.Tuple2;

import static openfly.org.enjoy.coding.utils.Println.println;

public class C0844BackspaceStringCompare {

    class EditorChars{
        char [] cs=null;
        int size=0;
        public EditorChars(String input){
            cs=input.toCharArray();
            int sl=cs.length;
            int st=-1;
            for(int i1=0;i1<sl;i1++){
                if(cs[i1]=='#'){
                    st--;
                }
                else{
                    if(st<0){
                        st=0;
                    }
                    cs[st++]=cs[i1];
                }
            }
            if(st<0){
                size=0;
            }
            else
                size=st;
        }

        public boolean equals(EditorChars other){


            if(other.size==size){
                for(int i1=0;i1<size;i1++){
                    if(cs[i1]!=other.cs[i1]){
                        return false;
                    }
                }
                return true;
            }
            else{
                return false;
            }
        }
    }

    public boolean backspaceCompare(String S, String T) {

        return new EditorChars(S).equals(new EditorChars(T));
    }



    public static void main(String[] argv) {

        new C0844BackspaceStringCompare().backspaceCompare(null,null);

    }
}
