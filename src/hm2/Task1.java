package hm2;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int spaces=0;
        char ch, ignore;

        do{
            ch=(char) System.in.read();
            if(ch==' ') ++spaces;
            do{
                ignore=(char) System.in.read();
            } while(ignore!='\n');
        } while(ch!='.');

        System.out.println("Spaces: "+spaces);
    }
}
