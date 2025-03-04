package hm2;

import java.io.IOException;

public class RegChange {
    public static void main(String[] args) throws IOException {
        char ch, ignore;
        int count=0;
        //A-65; Z-90; a-97; z-122

        do{
            System.out.print("Введите символ: ");
            ch = (char) System.in.read();
            if(ch>=65 & ch<=90) {
                System.out.println("Строчный вариант буквы "+ch+" : "+(char)(ch+32));
                ++count;
            }else if(ch>=97 & ch<=122) {
                System.out.println("Прописной вариант буквы "+ch+" : "+(char)(ch-32));
                ++count;
            }
            else System.out.println(ch);
            do{
                ignore = (char) System.in.read();
            } while(ignore!='\n');
        }while(ch!='.');
        System.out.println("Регистр был изменён для "+count+" символов.");
    }
}
