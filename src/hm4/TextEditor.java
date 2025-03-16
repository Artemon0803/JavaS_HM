package hm4;

public class TextEditor {
    private String string = "";

    void printString(){
        System.out.println(string);
    }

    void addTextEnd(String str){
        if(string.equals("")) string=str;
        else string+=" "+str;
    }

    void addTextStart(String str){
        if(string.equals("")) string=str;
        else string=str+" "+string;
    }
}
