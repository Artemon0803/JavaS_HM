package hm4;

import java.util.Scanner;

public class TextEditorDemo {
    public static void main(String[] args) {
        TextEditor textEdit = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        textEdit.addTextEnd("world!");
        textEdit.printString();
        textEdit.addTextStart("Hello");
        textEdit.printString();
        textEdit.addTextEnd("Have a good day!");
        textEdit.printString();
    }
}
